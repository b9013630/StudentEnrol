package com.enrol

class Course {

	String department
	String courseTitle
	String courseLeader
	String courseCode
	Date startDate
	Date endDate
	String description
	Integer numberOfStudents
	Double tuitionFees
	String studyMode

//Will convert com.enrol.course course 1 to 'coursetitle'
	String toString(){
		return courseTitle
	}

    static constraints = {

	courseTitle blank:false, nullable:false
	department blank:false, nullable:false
	courseLeader blank:false, nullable:false
	courseCode blank:false, nullable:false
	numberOfStudents blank:false, nullable:false, min:20, max:60 
	startDate blank:false, nullable:false
	endDate blank:false, nullable:false
	studyMode blank:false, nullable:false, size:1..20
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'
	tuitionFees blank:false, nullable:false, scale:3
    }


	static hasMany = [students:Student, modules:Module, lecturers:Lecturer] //1:m relationship

	static belongsTo = [courseLeader:Course] //1:1

}
