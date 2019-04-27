package edu.handong.analysis;

import edu.handong.analysis.datamodel.*;

public class HGUCoursePatternAnalyzer {
	
	private int numOfStudents; // 총 학생의 수
	private int numOfCourses; // 총 수업의 수
	private Student[] students; // lines에서 학생 목록을 뽑아서 저장
	private Course[] courses; // lines에서 course 목록을 뽑아서 저장

	public static void main(String[] args) {
		HGUCoursePatternAnalyzer analyzer = new HGUCoursePatternAnalyzer();
		analyzer.run(args);
	}

	private void run(String [] args) {
		
	}
	
	private Student[] initiateStudentArrayFromLines(String[] lines) {
		
	}
	private boolean studentExist(Student[] students, Student student) {
		
	}
	private Course[] initiateCourseArrayFromLines(String[] lines) {
		
	}
	private boolean courseExist(Course[] courses, Course course) {
		
	}


}
