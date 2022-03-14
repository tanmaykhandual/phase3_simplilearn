<html>
<body>
<h2>Spring Application</h2>

<h2 class="hello-title">Welcome ${name}!</h2>
<h3>User List <a href="users">Click here</a><br><br></h3>
<form action="search/{id}" method="post">
Enter ID Number: <input name="id" type="text" id="id" placeholder=" " required/><br><br>
<input name="Submit" type="submit"/>
</form>

</body>
</html>
