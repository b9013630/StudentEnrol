<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolment System | Simple Search</title>
    <asset:stylesheet src="home.css" />
</head>
<body>
<div class="row">
<h1>Sreda Student Enrolment System</h1>
<h3> Search Result</h3>

<p>
Searched ${totalStudents} records
for items matching <em>${term}</em>.
Found <strong>${students.size()}</strong> Students.
</p>

<ul>
<g:each var="student" in="${students}">
<li><g:link controller="student" action="show"
id="${student.id}">${student.studentName}</g:link></li>
</g:each>
</ul>

<button type="button" class="btn btn-success">
<g:link action='search'>Search Again</g:link>
</button>

</div>
</body>
</html>
