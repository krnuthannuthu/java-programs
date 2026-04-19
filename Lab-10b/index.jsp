<!DOCTYPE html>
<html>
<head>
<title>User Registration Form</title>

<script>
function validateForm() {

    let username = document.forms["userForm"]["username"].value;
    let email = document.forms["userForm"]["email"].value;
    let designation = document.forms["userForm"]["designation"].value;

    if (username == "" || email == "" || designation == "") {
        alert("All fields are required");
        return false;
    }

    // Simple email validation
    let emailPattern = /\S+@\S+\.\S+/;
    if (!emailPattern.test(email)) {
        alert("Enter valid email");
        return false;
    }

    return true;
}
</script>

</head>

<body>

<h2>User Registration Form</h2>

<form name="userForm" action="UserDataServlet" method="post" onsubmit="return validateForm()">

Username: <input type="text" name="username"><br><br>

Email: <input type="text" name="email"><br><br>

Designation: <input type="text" name="designation"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>