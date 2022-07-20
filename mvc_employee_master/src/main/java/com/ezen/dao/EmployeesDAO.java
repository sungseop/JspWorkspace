package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ezen.dto.EmployeesVO;

import util.DBManager;

public class EmployeesDAO {
	private EmployeesDAO() {
	}
	
	private static EmployeesDAO instance = new EmployeesDAO();
	
	public static EmployeesDAO getInstance() {
		return instance;
	}

	public int userCheck(String userid, String pwd, String lev){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT pass FROM employees WHERE id=?";
		int result = -1;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String db_pwd = rs.getString("pwd");
				if (pwd.equals(db_pwd)) {
					String db_lev = rs.getString("lev");
					if (lev.equals(db_lev)) {
						if (lev == "A") {
							result = 2;
						} else {
							result = 3;
						}
					} else {
						result = 1;
					}
				} else {
					result = 0;
				}
			} else {
				result = -1;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				DBManager.close(conn, pstmt, rs);
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return result;		
	}
	
	public EmployeesVO getMember(String id){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member WHERE userid=?";
		EmployeesVO employee = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				employee = new EmployeesVO();
				
				employee.setId(rs.getString("id"));
				employee.setPass(rs.getString("pass"));
				employee.setName(rs.getString("name"));
				employee.setLev(rs.getString("lev"));
				employee.setEnter(rs.getDate("enter"));
				employee.setGender(Integer.parseInt(rs.getString("gender")));
				employee.setPhone(rs.getString("phone"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		return employee;
	}
	
	public void insertMember(EmployeesVO member) {
		String sql = "insert into employees values(?,?,?,?,SYSDATE,?,?)";		
		Connection conn = null;

		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			// ?에 값 세팅
			pstmt.setString(1, member.getId());
			pstmt.setString(2, member.getPass());
			pstmt.setString(3, member.getName());
			pstmt.setString(4, member.getLev());			
			pstmt.setInt(5, member.getGender());
			pstmt.setString(6, member.getPhone());
			System.out.println(pstmt.executeUpdate());			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public int updateMember(EmployeesVO eVo) {
		int result = -1;
		String sql = "update employees set gender=?, pass=?, name=?, lev=?, phone=? where id=?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, eVo.getGender());
			pstmt.setString(2, eVo.getPass());
			pstmt.setString(3, eVo.getName());
			pstmt.setString(4, eVo.getLev());
			pstmt.setString(5, eVo.getPhone());
			pstmt.setString(6, eVo.getId());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}	
}
