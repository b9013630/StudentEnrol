package com.enrol

class StudentController {

    def scaffold= Student

	def results(String name){

	def students=Students.where{
	
		studentName=~name

	}.list()

	return[students:students, term:params.name, totalStudents:Student.count()]

	}
}
