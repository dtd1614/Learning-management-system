package dataManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import grpc.Reservation.Course;
import grpc.Reservation.CourseList;

public class CourseManager {
	protected CourseList.Builder courseList;
	
	public CourseManager(String fileName) throws IOException {
		this.courseList = CourseList.newBuilder();
		BufferedReader objCourseFile = new BufferedReader(new FileReader(fileName));
		while (objCourseFile.ready()) {
			String courseInfo = objCourseFile.readLine();
			if (!courseInfo.equals("")) this.courseList.addCourse(this.setCourse(courseInfo));
		}
		this.courseList.setException("");
		objCourseFile.close();
	}
	
    public Course.Builder setCourse(String inputString) {
		Course.Builder course = Course.newBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(inputString);
        course.setCourseId(stringTokenizer.nextToken());
    	course.setProfessorName(stringTokenizer.nextToken());
    	course.setCourseName(stringTokenizer.nextToken());
    	while (stringTokenizer.hasMoreTokens()) {
    		course.addPrerequisite(stringTokenizer.nextToken());
    	}
    	return course;
    }
	public CourseList.Builder getCourseList(){
		return this.courseList;
	}
	public void addCourse(String courseInfo){
		this.courseList.addCourse(this.setCourse(courseInfo));
	}	
	public void deleteCourse(String courseId){
		for (int i = 0; i < this.courseList.getCourseCount(); i++) {
			Course.Builder course = this.courseList.getCourseBuilder(i);
			if (course.getCourseId().equals(courseId)) {
				this.courseList.removeCourse(i); return; 
			}
		}
	}	
	public void makeReservation(String reservationInfo) {
        StringTokenizer stringTokenizer = new StringTokenizer(reservationInfo);
		String studentId = stringTokenizer.nextToken();
		String courseId = stringTokenizer.nextToken();
		for (int i = 0; i < this.courseList.getCourseCount(); i++) {
			Course.Builder course = this.courseList.getCourseBuilder(i);
			if (course.getCourseId().equals(courseId)) {
				course.addReservedStudent(studentId); return; 
			}
		}
	}
}
