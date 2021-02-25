package com.enrol

class Lecturer {

String toString(){
		return fullName
	}

	String fullName
	String post
	String subject
	String lecturerEmail
	String office
	String bio

    static constraints = {

	fullName nullable:false, blank:false
	post nullable:false, blank:false
	subject nullable:false, blank:false
	lecturerEmail nullable:false, blank:false, email:true
	office nullable:false, blank:false
	bio nullable:false, blank:false, size:0..5000, widget:'textarea'

    }

	static hasMany = [modules:Module, courses:Course] //1:m relationship

	static belongsTo = [courses:Course]
}
