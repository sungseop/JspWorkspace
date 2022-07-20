package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ezen.dto.BoardVO;

import util.DBManager;

public class BoardDAO {
	
	private BoardDAO() { }
	
	private static BoardDAO instance = new BoardDAO();
	
	public static BoardDAO getInstance() {
		return instance;
	}
	
	// 게시글 목록 전체 조회
	public List<BoardVO> selectAllBoards() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM board ORDER BY num DESC";
		List<BoardVO> boardList = new ArrayList<>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setPass(rs.getString("pass"));
				board.setEmail(rs.getString("email"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWritedate(rs.getDate("writedate"));
				
				boardList.add(board);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(null, pstmt, rs);
		}
		
		return boardList;
	}
	
	// 게시글 입력 정보를 DB에 저장
	public void insertBoard(BoardVO board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO board(num, pass, name, email, title, content)"
					+ "VALUES(board_seq.NEXTVAL, ?, ?, ?, ?, ?)";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getPass());
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getTitle());
			pstmt.setString(5, board.getContent());
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public BoardVO selectOneBoardByNum(String num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM board WHERE num=?";
		BoardVO board = null;
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO();
				board.setNum(rs.getInt("num"));
				board.setName(rs.getString("name"));
				board.setPass(rs.getString("pass"));
				board.setEmail(rs.getString("email"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWritedate(rs.getDate("writedate"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt, rs);
		}
		
		return board;
	}
	
	public void updateReadCount(String num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE board SET readcount=readcount+1 WHERE num=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void updateBoard(BoardVO board) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "UPDATE board SET pass=?, name=?, email=?, title=?, content=? WHERE num=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, board.getPass());
			pstmt.setString(2, board.getName());
			pstmt.setString(3, board.getEmail());
			pstmt.setString(4, board.getTitle());
			pstmt.setString(5, board.getContent());
			pstmt.setInt(6, board.getNum());
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
	
	public void deleteBoard(String num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM board WHERE num=?";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, num);
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(conn, pstmt);
		}
	}
}
