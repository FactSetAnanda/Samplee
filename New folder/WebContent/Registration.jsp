<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="Registration.css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body  Style="font-family:Segoe UI Symbol;font-size:34px;">
<form class="form" action="TopicCatalog.jsp" method="post">
<div id="header">
<img src="Braintrainlogo.jpg" style="height:140px;width:140px" alt="BrianTrainLogo" align="left">
</div>
<br>
<p style="padding-left: 89px;padding-top:145px;color:#0000a0" background="yellow">Your Registration Id is: ${registrationId} *</p>

<div class="container" style="width: 100%;">
 <div class="container">
   <img src="goodluck.jpg" style="height:170px;width:160px;padding-top: 30px"/>
   <br>
   <input type="submit" style="float:right;height:30px;width:130px;position:relative" value="Log In"/>
   <a href="TopicCatalog.jsp"></a>
 </div>
</div>
</form>
</body>
</html>
