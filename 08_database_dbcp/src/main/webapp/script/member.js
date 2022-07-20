/**
 * 
 */
 function loginCheck() {
	var userid = document.getElementById("userid").value; // login.jsp의 userid값을 userid에 저장
	var userpwd = document.getElementById("userpwd").value; // login.jsp의 userpwd값을 userpwd에 저장
	if (userid == "") {
		alert("아이디를 입력해 주세요!");
		document.getElementById("userid").focus();
		return false;
	}
	
	if (userpwd == "") {
		alert("비밀번호를 입력해 주세요!");
		document.getElementById("userpwd").focus();
		return false;
	}
	
	return true;
}

function joinCheck() {
	var name = document.getElementById("name").value;
	var userid = document.getElementById("userid").value;
	var pwd = document.getElementById("pwd").value;
	var pwd_chk = document.getElementById("pwd_check").value;
	var reid = document.getElementById("reid").value;
	
	if (name == "") {
		alert("이름은 필수입력 항목입니다.");
		document.getElementById("name").focus();
		return false;
	}
	if (userid == "") {
		alert("사용자 아이디는 필수입력 항목입니다.");
		document.getElementById("userid").focus();
		return false;
	}
	if (pwd == "") {
		alert("비밀번호는 필수입력 항목입니다.");
		document.getElementById("pwd").focus();
		return false;
	}
	if (pwd_chk == "") {
		alert("비밀번호확인은 필수입력 항목입니다.");
		document.getElementById("pwd_chk").focus();
		return false;
	}
	if (pwd != pwd_chk) {
		alert("암호가 일치하지 않습니다. 다시 입력해 주세요.")
		document.getElementById("pwd").focus();
		return false;
	}
	if (reid == "") {
		alert("아이디 중복체크를 하지 않았습니다.");
		document.getElementById("userid").focus();
		return false;
	}
	
	return true;
}

// 회원가입시 사용자ID가 이미 사용중인지 확인
function idCheck() {
	var userid = document.getElementById("userid").value;
	
	if (userid == "") {
		alert("사용자 아이디를 입력해 주세요.");
		document.getElementById("userid").focus();
		return false;
	}
	
	var url = "idCheck.do?userid="+userid;
	
	// 팝업창 열기
	window.open(url, "_blank_", "toolbar=no, menubar=no, scrollbars=yes, resizable=no, width=450, height=200");
}
function  idok() {
	// opener: 회원가입 화면, document: 아이디 중복체크 화면
    //opener.frm.userid.value = document.frm.userid.value;
    //opener.frm.reid.value = document.frm.userid.value;
    opener.document.getElementById("userid").value = document.getElementById("userid").value;
    opener.document.getElementByid("reid").value = document.getElementById("userid").value;
    self.close();
}