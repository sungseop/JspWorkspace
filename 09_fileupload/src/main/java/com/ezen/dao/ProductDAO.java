package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ezen.dto.ProductVO;

import util.DBManager;

public class ProductDAO {
	private ProductDAO() {}
	
	private static ProductDAO instance = new ProductDAO();
	
	public static ProductDAO getInstance() {
		return instance;
	}
	
	// 전체 상품 목록 조회
	public List<ProductVO> selectAllProducts() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM product ORDER BY code";
		
		List<ProductVO> productList = new ArrayList<ProductVO>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// 개별상품 하나씩 저장
				ProductVO product = new ProductVO();
				product.setCode(rs.getInt("code"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setPictureurl(rs.getString("pictureurl"));
				product.setDescription(rs.getString("description"));
				
				// 리스트에 항목을 추가
				productList.add(product);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return productList;
	}
	
	public void insertProduct(ProductVO product) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO product VALUES(product_seq.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getPictureurl());
			pstmt.setString(4, product.getDescription());
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public ProductVO selectProductByCode(String code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM prouduct WHERE code=?";
		ProductVO product = new ProductVO();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, code);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				product.setCode(rs.getInt("code"));
				product.setName(rs.getString("name"));
				product.setPrice(rs.getInt("price"));
				product.setPictureurl(rs.getString("pictureurl"));
				product.setDescription(rs.getString("description"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return product;
	}
	
	public void updateProduct(ProductVO product) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE product SET name=?, price=?, prctureurl=?, description=?, WHERE code=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, product.getName());
			pstmt.setInt(2, product.getPrice());
			pstmt.setString(3, product.getPictureurl());
			pstmt.setString(4, product.getDescription());
			pstmt.setInt(5, product.getCode());
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void deleteProduct(String code) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM product WHERE code=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  code);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
}
