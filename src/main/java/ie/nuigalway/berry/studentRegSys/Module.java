package ie.nuigalway.berry.studentRegSys;

import java.util.ArrayList;

public class Module {
	
	private String Name;
	private int ID;
	private  ArrayList<Student> Students;
	private ArrayList<Course> Courses;
	
	public Module(String name, int id){
        this.Name = name;
        this.ID = id;
        this.Courses = new ArrayList<Course>();
        this.Students = new ArrayList<Student>();
    }

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int id) {
		ID = id;
	}

	public ArrayList<Student> getStudents() {
		return Students;
	}

	public void setStudent(Student student) {
		Students.add(student);
	}

	public ArrayList<Course> getCourses() {
		return Courses;
	}

	public void setCourse(Course course) {
		Courses.add(course);
	}
	
	@Override public String toString(){
        String courses = new String();
        for(int i=0; i<getCourses().size(); i++){
                    courses += getCourses().get(i).getName() + ", ";
        }
        String students = new String();
        for(int i=0; i<getStudents().size(); i++){
                    students += getStudents().get(i).getName() + ", ";
        }
        return "Module: " + Name + "\tID: " + Integer.toString(ID) +
                "\tCourses: " +  courses +
                "\tStudents: " + students;
    }

}