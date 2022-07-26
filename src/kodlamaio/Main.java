package kodlamaio;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {



		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		
		Lesson lesson1 = new Lesson();
		lesson1.setId(1);
		lesson1.setName("Java&React");
		lesson1.setDescription("Bu dersin icerigi javadir.");
		lesson1.setInstructor(instructor1);
		
		Lesson lesson2 = new Lesson();
		lesson2.setId(2);
		lesson2.setName("C#&Angular");
		lesson2.setDescription("Bu dersin icerigi C#.");
		lesson2.setInstructor(instructor1);
		
		Lesson lesson3 = new Lesson();
		lesson3.setId(3);
		lesson3.setName("Javascript");
		lesson3.setDescription("Bu dersin icerigi javascript.");
		lesson3.setInstructor(instructor1);
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		CategoryManager categoryManager = new CategoryManager(new ArrayList<Category>());
		categoryManager.add(category1);
		categoryManager.delete(category1);
		
		InstructorManager instructorManager = new InstructorManager(new ArrayList<Instructor>());
		instructorManager.add(instructor1);
		
		LessonManager lessonManager = new LessonManager(new ArrayList<Lesson>());
		lessonManager.add(lesson1);
		lessonManager.add(lesson2);
		lessonManager.add(lesson3);
		lessonManager.delete(lesson3);
		
		for (Category category : categoryManager.getAll()) {
			System.out.println(category.getName());
		}
		
		for (Instructor instructor : instructorManager.getAll()) {
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
		
		for (Lesson lesson : lessonManager.getAll()) {
			System.out.println(lesson.getName()+" "+lesson.getDescription()+" "+lesson.getInstructor().getFirstName());
		}
		
//		System.out.println(lesson1.getName()+ " " + lesson1.getDescription()+" "+ lesson1.getInstructor().getFirstName());
//		System.out.println(lesson2.getName()+ " " + lesson2.getDescription()+" "+ lesson2.getInstructor().getFirstName());
//		System.out.println(lesson3.getName()+ " " + lesson3.getDescription()+" "+ lesson3.getInstructor().getFirstName());
	}

}
