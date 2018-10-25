package ie.nuigalway.berry.studentRegSys;

import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Student {
	
	private String Name;
	private int Age;
	private LocalDate DateOfBirth;
	private int ID;
	private String Username;
	private Course Course;
	private ArrayList <Module> Modules = new ArrayList<Module>();
	
	public Student(String name, int age, LocalDate DOB, int id, Course course){
        this.Name = name;
        this.Age = age;
        this.DateOfBirth = DOB;
        this.ID = id;
        this.Course = course;
        setUsername();
    }
	
	public String getUsername() {
		return Username;
	}

	public void setUsername() {
		Username = Name + Integer.toString(Age);
	}
    
    public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(LocalDate DOB) {
		DateOfBirth = DOB;
	}

	public Course getCourse() {
		return Course;
	}

	public void setCourse(Course course) {
		Course = course;
	}

	public ArrayList<Module> getModules() {
		return Modules;
	}

	public void setModule(Module module) {
		Modules.add(module);
	}


	
	 @Override public String toString(){
	        String course = getCourse().getName();
	        String username = getUsername();
	        String modules = new String();
	        for(int i=0; i<getModules().size(); i++){
	                    modules += getModules().get(i).getName() + ", ";
	        }
	        return "Student: " + this.Name + "\tID: " + Integer.toString(ID) + username +
	                "\tCourse: " +  course +
	                "\tModules: " + modules;
	    }
}
