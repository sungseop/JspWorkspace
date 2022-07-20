/**
 * 
 */
function boardCheck() {
	var name = document.getElementById("name").value;
	var pass = document.getElementById("pass").value;
	var title = document.getElementById("title").value;
	
	if(name == "") {
		alert("작성자를 입력해 주세요.");
		document.getElementById("name").focus();
		return false;
	}
	if(pass == "") {
		alert("비밀번호를 입력해 주세요.");
		document.getElementById("pass").focus();
		return false;
	}
	if(title == "") {
		alert("제목을 입력해 주세요.");
		document.getElementById("title").focus();
		return false;
	}
	
	return true;
}

function open_win(url, name) {
	// url = BoardServlet?command=board_chack_pass_form&num=?
	// name : 'update', 'delete'
	window.open(url, name, "width=500, height=200");
}

function passCheck() {
	var pass = document.getElementById("pass").value;
	
	if(pass == "") {
		alert("비밀번호를 입력하세요");
		document.getElementById("pass").focus();
		return false;
	}
	
	return true;
}