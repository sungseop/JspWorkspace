package com.ezen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.ezen.dto.MovieVO;

import util.DBManager;


public class MovieDAO {

	private MovieDAO() { }
	
	private static MovieDAO instance = new MovieDAO();
	
	public static MovieDAO getInstance() {
		return instance;
	}
	
	// 게시글 목록 전체 조회
	public List<MovieVO> selectAllMovies() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM movie ORDER BY code DESC";
		List<MovieVO> movieList = new ArrayList<>();
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MovieVO movie = new MovieVO();
				movie.setCode(rs.getInt("code"));
				movie.setTitle(rs.getString("title"));
				movie.setPrice(rs.getInt("price"));
				movie.setDirector(rs.getString("director"));
				movie.setPoster(rs.getString("poster"));
				movie.setSynopsis(rs.getString("Synopsis"));
				
				movieList.add(movie);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBManager.close(null, pstmt, rs);
		}
		
		return movieList;
	}
}
