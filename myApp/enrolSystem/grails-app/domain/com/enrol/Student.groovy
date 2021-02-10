package com.enrol

class Student {
//declaring variables
	String studentName
	String studentID
	Date dob
	Boolean isFundingAvailable
	String studentEmail
	String studentUsername
	String studentPassword
	static belongsTo = [course:Course] //stating the owner of relaionship

    static constraints = {
//declaring constraints
	studentName blank:false, nullable:false
	studentID blank:false, nullable:false
	dob blank:false, nullable:false
	studentEmail blank:false, nullable:false, email:true
	studentUsername blank:false, nullable:false, unique:true
	studentPassword blank:false, nullable:false
	isFundingAvailable blank:false, nullable:false
	//course blank:false, nullable:false

    }
	
}
