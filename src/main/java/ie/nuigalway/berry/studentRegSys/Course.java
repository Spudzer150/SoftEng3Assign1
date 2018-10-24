package ie.nuigalway.berry.studentRegSys;


import java.util.ArrayList;
import org.joda.time.LocalDate;

public class Course {
	
	private String Name;
	private ArrayList<Module> Modules = new ArrayList<Module>();
	private ArrayList<Student> Students = new ArrayList<Student>();
	private LocalDate StartDate;
	private LocalDate EndDate;
	
	public Course(String name, LocalDate start, LocalDate end) {
		this.Name = name;
		this.StartDate = start;
		this.EndDate = end;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ArrayList<Module> getModules() {
		return Modules;
	}
	public void setModules(Module module) {
		Modules.add(module);
	}
	public ArrayList<Student> getStudents() {
		return Students;
	}
	public void setStudents(Student student) {
		Students.add(student);
	}
	public LocalDate getStartDate() {
		return StartDate;
	}
	public void setStartDate(LocalDate startDate) {
		StartDate = startDate;
	}
	public LocalDate getEndDate() {
		return EndDate;
	}
	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}
	
	@Override public String toString(){
        String modules = new String();
        for(int i=0; i<getModules().size(); i++){
                    modules += getModules().get(i).getName() + ", ";
        }
        String students= new String();
        for(int i=0; i<getStudents().size(); i++){
                    students += getStudents().get(i).getName() + ", ";
        }
        return "Course: " + Name + "\tStart Date: " + StartDate + "\tEnd Date: " + EndDate +
                "\tModules: " +  modules +
                "\tStudents: " + students;
    }
}
