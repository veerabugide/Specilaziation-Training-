<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html; charset=ISO-8859-1"%>
<html>
<head>
    <title>demo</title>
</head>
<body>

<h2> Hii ${username} </h2>
<hr>
    <h2>Enter Details</h2>
    <h2>

        <form action="save">
            <table>
                <tr>
                    <td>Enter ID:</td><td><input type="number" name="id"></td>
                </tr>
          <tr>
              <td>Enter Name:</td><td><input type="text" name="name"></td></tr>
           <tr>
                <td>Enter Designation:</td><td><input type="text" name="desig"></td>
        </tr>
            <tr>
            <td>
                <input type="submit" value="save"></td>
            </tr>
            </table>
        </form>
    </h2>
<h3>Hii ${emp.name} your designation is ${emp.desig}</h3>
</body>
</html>