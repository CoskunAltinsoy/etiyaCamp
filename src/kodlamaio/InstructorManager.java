package kodlamaio;

import java.util.List;

public class InstructorManager {

	private List<Instructor> instructors;
	
	public InstructorManager(List<Instructor> instructors) {
		this.instructors = instructors;
	}
	
	public void add(Instructor instructor) {
		instructors.add(instructor);
	}
	public void delete(Instructor instructor) {
		instructors.remove(instructor);
	}
	public List<Instructor> getAll(){
		return instructors;
	}
}
