<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Sreda Enrolment System | Simple Search</title>

</head>
<body>
<div class="row">
	<h1>Sreda Student Enrolment System</h1>

	<formset>
		<legend>Search for Students(simple)</legend>
		<g:form action"results">
		<label for="name">Student Name</label>
			<g:textField name="name"/>
			<g:submitButton name="search" value="Search"/>
		</g:form>
		</formset>
</div>
</body>
</html>
