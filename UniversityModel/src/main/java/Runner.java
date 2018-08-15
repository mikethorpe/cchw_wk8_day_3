import db.DBHelper;
import models.Course;
import models.Student;

import java.util.List;

public class Runner {

	public static void main(String[] args) {

		Course softwareDevelopment = new Course("Software Development", 1);
		DBHelper.save(softwareDevelopment);

		Student stuart = new Student("Stuart", 14, 575, softwareDevelopment);
		DBHelper.save(stuart);
//		DBHelper.delete(stuart);

		Student vicky = new Student("Vicky", 13, 576, softwareDevelopment);
		DBHelper.save(vicky);

		vicky.setName("Victoria");
		DBHelper.update(vicky);

		List<Student> allStudents = DBHelper.findAll(Student.class);
		Student findStuart = DBHelper.findById(Student.class, 1);

	}
}
