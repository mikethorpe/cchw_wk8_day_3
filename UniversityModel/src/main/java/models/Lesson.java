package models;

import javax.persistence.*;

@Entity
@Table(name = "lessons")
public class Lesson {

	private int id;
	private String title;
	private int classRoomNumber;
	private Course course;

	public Lesson(String title, int classRoomNumber, Course course) {
		this.title = title;
		this.classRoomNumber = classRoomNumber;
		this.course = course;
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
}
