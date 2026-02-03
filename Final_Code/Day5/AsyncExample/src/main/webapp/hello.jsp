<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<button onclick="callAsync()">Call Async Servlet</button>
<p id="result"></p>


<script>
function callAsync() {
  fetch('/AsyncDemoServlet')
    .then(res => res.text())
    .then(data => {
      document.getElementById("result").innerText = data;
    });
}
</script>
</body>
</html>