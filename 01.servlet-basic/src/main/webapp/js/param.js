/**
 * 
 */
 // document(jsp내용)에서 아이디가 id인 것을 찾아서 밸류가 없으면 alert 출력
 function check() {
	if (document.getElementById("id").value=="") {
		alert("아이디를 입력해 주세요.");
		document.getElementById("id").focus(); // id입력창에 입력대기하도록 함
		return false;
	} else if (document.getElementById("age").value=="") {
		alert("나이를 입력해 주세요.");
		document.getElementById("age").focus();
		return false;
	} else if (isNaN(document.getElementById("age").value)) { // IsNaN : 숫자인지 아닌지
		alert("숫자를 입력해 주세요.")
		document.getElementById("age").focus();
		return false;
	}
	
	return true;
}