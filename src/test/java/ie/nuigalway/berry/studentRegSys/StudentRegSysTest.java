package ie.nuigalway.berry.studentRegSys;


import ie.nuigalway.berry.studentRegSys.Student;

import static org.junit.Assert.*;

import org.joda.time.LocalDate;
import org.junit.*;

public class StudentRegSysTest {
    
    @Test
    public void testGetUsername() {
        Student student = new Student("Murphy Berry", 20, LocalDate.parse("1998-01-19"), 150, new Course("CS&IT", LocalDate.parse("2015-01-01"), LocalDate.parse("2019-12-31")));
       
        assertEquals("Murphy Berry20", student.getUsername());
    }
}