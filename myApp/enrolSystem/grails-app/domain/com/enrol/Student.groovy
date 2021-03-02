package com.enrol

class Student {

	String toString(){
		return studentName
	}	

//declaring variables
	String studentName
	String studentID
	Date dob
	Boolean isFundingAvailable
	String studentEmail
	String studentUsername
	String studentPassword
	

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

	static belongsTo = [course:Course] //stating the owner of relaionship 1:1 #1
	static hasMany = [modules:Module] // #7mods

}
