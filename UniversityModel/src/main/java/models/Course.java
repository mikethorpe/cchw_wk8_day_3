package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {

	private int id;
	private String title;
	private int level;
	private List<Student> students;

	public Course(String title, int level) {
		this.title = title;
		this.level = level;
	}

	public Course() {
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

	@Column(name = "level")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@OneToMany(mappedBy = "course", fetch = FetchType.LAZY)
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
