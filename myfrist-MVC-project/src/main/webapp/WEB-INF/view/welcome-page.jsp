<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Weclomes to ${myWebsiteName}</h1>
My name is :${myname},welcome to MOM'S cafe.You can order your food by clicking below link</br></br>
<a href=""></a>
<div class="container">
<form action="placeOrder">
<label for="items" >Item Name:</label>
<input type="text" id="items" name="foodType" placeholder="enter your item">
<input type="submit" value="submit">

</form>
</div>
</body>
</html>