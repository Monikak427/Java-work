package arraylists;

import arraylists.Student;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import arraylists.RemoveStudents;

public class RemoveStudentsTest {

    @Test
    public void testRemoveBelowAverageGPA() {
        // Create an ArrayList of Students
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Jane", "Smith", 3.2));
        studentList.add(new Student("Alice", "Johnson", 3.8));

        // Create an instance of the class to test
        RemoveStudents remover = new RemoveStudents();

        // Test removing students with GPA below average
        remover.removeBelowAverageGPA(studentList);

        // Verify the remaining students
        assertEquals(2, studentList.size());
        assertEquals("John", studentList.get(0).firstName);
    }
}