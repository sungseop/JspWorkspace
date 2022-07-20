<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 등록</title>
<link rel="stylesheet" href="css/movie.css">
<script src="script/movie.js"></script>
</head>
<body>
<div id="wrap" align="center">
<h1>영화 등록</h1>
<form enctype="multipart/form-data" method="post" action="MovieServlet" name="frm">
   <input type="hidden" name="command" value="movie_write">
   <table>
      <tr>
         <th> 제  목 </th>
         <td><input type="text" name="mtitle" id="mtitle" size="60"></td>
      </tr> 
      <tr>
        <th> 가  격  </th>
        <td><input type="text" name="price" id="price" size="60"> 원</td>
      </tr>
      <tr>
        <th> 감  독  </th>
        <td><input type="text" name="director" id="director" size="60"></td>
      </tr>
      <tr>
        <th> 배  우  </th>
        <td><input type="text" name="actor" id="actor" size="60"></td>
      </tr>
      <tr>
         <th> 설  명 </th> 
         <td><textarea cols="70" rows="10" name="synopsis" id="synopsis"></textarea></td>
      </tr>
      <tr>
         <th> 사 진</th>
         <td>
            <input type="file" name="poster" ><br>
        </td>
      </tr>  
   </table>
   <br>
   <input type="submit" value="확인"  onclick="return movieCheck()">
   <input type="reset" value="취소">
   <input type="button" value="목록" onclick="location.href='MovieServlet?command=movie_list'" >
</form>
</div>
</body>
</html>