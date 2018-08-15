package db;

import models.Lesson;
import models.Student;

public class DBLesson {

	public static void addStudentToLesson (Lesson lesson, Student student){
		lesson.addStudent(student);
		student.addLesson(lesson);
		DBHelper.update(lesson);
	}
}
