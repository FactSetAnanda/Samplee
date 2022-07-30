<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
 
 
 
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="Registration.css" >
<meta charset="ISO-8859-1">

<title>Topic Select Catalog</title>
</head>
<body  Style="font-family:calibri;font-size:25px;background-color:green">
<div class=".boxed">

<div id="header">
<img src="Braintrainlogo.jpg" style="height:140px;width:140px" alt="BrainTrainLogo" align="left">
<h2 id="h2" align="center">Topic Catalog </h2> 
</div>
<form name="myform" action="java.jsp">
<table align="center" class="table">
<tr><td>

<input type="radio" name="topic" value="JAVA">JAVA<br></td>
</tr>
<tr> <td><input type="radio" name="topic" value="J2EE">J2EE<br></td></tr>
<tr><td> 
  <input type="radio" name="topic" value="HYBERNATE">HYBERNATE<br></td></tr>
  <tr><td><input type="radio" name="topic" value="SPRING">SPRING<br></td></tr>
  <input type="submit" name="submit" value="submit">
  </form>
  <form>
  <tr><td>Select Level:
</td></tr>
  <tr><td><select name="level">
<option value="Level 1" >Level 1</option>
<option value="Level 2" >Level 2</option>
<option value="level 3" >Level 3</option>
</form>
</select></td></tr>
<tr><td></td></tr>
</table>  


  </div> 
<div class="container" style="width: 100%;">
 <div class="container">
   <fieldset><legend color:royalblue>Sponsored by:</legend><img src="reebok.png" style="height:100px;width:240px;float:left;" alt="sponsor1" class="sponsor">
  <img src="sony.png" style="height:100px;width:240px;float:left;" alt="sponsor2" class="sponsor"></fieldset>
 </div>
</div>
</body>
</html>