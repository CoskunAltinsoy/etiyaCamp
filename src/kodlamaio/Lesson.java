package kodlamaio;

public class Lesson {

	private int id;
	private String name;
	private String description;
	private Instructor instructor;
	
	
	public Lesson() {
		super();
	}
	public Lesson(int id, String name, String description, Instructor instructor) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.instructor = instructor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Instructor getInstructor() {
		return instructor;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	
	
}
