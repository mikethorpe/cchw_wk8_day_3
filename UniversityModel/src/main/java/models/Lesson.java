package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "lessons")
public class Lesson {

	private int id;
	private String title;
	private int classRoomNumber;
	private Course course;
	private List<Student> students;

	public Lesson(String title, int classRoomNumber, Course course) {
		this.title = title;
		this.classRoomNumber = classRoomNumber;
		this.course = course;
		this.students = new ArrayList<Student>();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "classroom_number")
	public int getClassRoomNumber() {
		return classRoomNumber;
	}

	public void setClassRoomNumber(int classRoomNumber) {
		this.classRoomNumber = classRoomNumber;
	}

	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	@ManyToMany
	// JT Name
	// JT Column
	// JT Inverse column

	@JoinTable(name = "lessons_students",
		joinColumns = {@JoinColumn(name = "lesson_id", nullable = false, updatable = false)},
		inverseJoinColumns = {@JoinColumn(name = "student_id", nullable = false, updatable = false)}
	)
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student){
		this.students.add(student);
	}
}
