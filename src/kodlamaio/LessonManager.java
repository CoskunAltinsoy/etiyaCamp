package kodlamaio;

import java.util.List;

public class LessonManager {

	private List<Lesson> lessons;

	public LessonManager(List<Lesson> lessons) {
		super();
		this.lessons = lessons;
	}
	
	public void add(Lesson lesson) {
	    this.lessons.add(lesson);
	}
	
	public void delete(Lesson lesson) {
		this.lessons.remove(lesson);
	}
	
	public List<Lesson> getAll(){
		return lessons;
	}
}
