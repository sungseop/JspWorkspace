package com.ezen.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ezen.dao.MovieDAO;
import com.ezen.dto.MovieVO;
import com.green.controller.Action;

public class MovieWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MovieVO movie = (MovieVO)request.getAttribute("movie");
		
		MovieDAO mDao = MovieDAO.getInstance();
		mDao.insertMovie(movie);
		
		new MovieListAction().execute(request, response); // 영화목록 모듈 호출
	}

}
