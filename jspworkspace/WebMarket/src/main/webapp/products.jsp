<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%--현재 jsp 페이지에서 사용할 클래스를 설정하는 page 디렉티브 태그 --%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dto.Product" %>
	<%--해당 자바빈즈를 가지고와서 사용하는 useBean 액션 태그 --%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<%--css를 부트스트랩 활용(부트스트랩 4.0.0버전으로 다운로드 받은 css폴더가 webapp에 있고, 해당 링크를 삽입 --%>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 목록</title>
</head>
<body>
	<%--"menu.jsp" 내용을 포함시키는 include 액션 태그 --%>
	<jsp:include page="menu.jsp" />
	<%--상품 목록 부분 영역 생성 --%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%
	 	ArrayList<Product>listOfProducts = productDAO.getAllProducts(); //productDAO.getAllProducts() 메서드 구현
	 %>
	 <div class="container">
	 	<div class="row" align="center">
	 		<%--for문을 써서, 아이템 3개 각각 정보 나오는 것을 반복 구현 --%>
	 		<%
	 			for(int i=0; i<listOfProducts.size(); i++) {
	 				Product product = listOfProducts.get(i);
	 		%>
	 		<div class="col-md-4">
	 			<h3><%=product.getPname() %></h3>
	 			<p><%=product.getDescription() %>
	 			<p><%=product.getUnitPrice() %>원
	 		</div>
	 		<%
	 			} 		
	 		%>
	 	</div>
	 	<hr>
	</div>
	<jsp:include page="footer.jsp"	/> 		
</body>
</html>