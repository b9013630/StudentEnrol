package com.enrol

class Module {

	String toString(){
		return moduleTitle
	}

	String moduleTitle
	String moduleCode
	Integer credits
	//String course
	String description

    static constraints = {

	moduleTitle nullable:false, blank:false
	moduleCode nullable:false, blank:false
	credits nullable:false, blank:false, min:20, max:120
	course nullable:false, blank:false
	description nullable:false, blank:false, size:0..5000, widget:'textarea'

    }

<<<<<<< HEAD
	static hasMany = [course:Course, students:Student] //
	static BelongsTo = [course:Course, students:Student, lecturer:Lecturer] //part of many to many 
	
=======
	//static hasMany = [students:Student]
	//static belongsTo = [course:Course, lecturer:Lecturer]

>>>>>>> main
}
