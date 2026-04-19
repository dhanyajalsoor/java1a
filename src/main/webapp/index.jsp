<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let form = document.forms["studentForm"];

            let roll = form["rollno"].value;
            let name = form["studentname"].value;

            let subjects = [
                form["sub1"].value,
                form["sub2"].value,
                form["sub3"].value,
                form["sub4"].value,
                form["sub5"].value
            ];

            if (roll == "" || name == "") {
                alert("Roll No and Name are required!");
                return false;
            }

            for (let i = 0; i < subjects.length; i++) {
                if (subjects[i] == "") {
                    alert("All subject marks are required!");
                    return false;
                }
                if (isNaN(subjects[i]) || subjects[i] < 0 || subjects[i] > 100) {
                    alert("Enter valid marks between 0 and 100");
                    return false;
                }
            }

            return true;
        }
    </script>

</head>
<body>

<h2>Student Result Form</h2>

<form name="studentForm" action="ResultServlet" method="post"
      onsubmit="return validateForm()">

Roll No: <input type="text" name="rollno"><br><br>

Student Name: <input type="text" name="studentname"><br><br>

Sub1: <input type="text" name="sub1"><br><br>
Sub2: <input type="text" name="sub2"><br><br>
Sub3: <input type="text" name="sub3"><br><br>
Sub4: <input type="text" name="sub4"><br><br>
Sub5: <input type="text" name="sub5"><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>