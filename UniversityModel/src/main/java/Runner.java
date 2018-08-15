import db.DBHelper;
import models.Student;

public class Runner {

	public static void main(String[] args) {

	Student stuart = new Student("Stuart", 14, 575);
	DBHelper.save(stuart);
	Student vicky = new Student("Vicky", 13, 576);
	DBHelper.save(vicky);
	}


}
