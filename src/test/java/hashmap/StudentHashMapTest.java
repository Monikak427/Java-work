package hashmap;

import hashmap.StudentHashMap;

import org.junit.jupiter.api.Test;

import arraylists.Student;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

class StudentHashMapTest {

    @Test
    void testGetStudentByName() {
        HashMap<String, Student> studentMap = StudentHashMap.createStudentHashMap();
        Student student = StudentHashMap.getStudentByName(studentMap, "John");

        assertNotNull(student);
        assertEquals("John", student.firstName);
        assertEquals("Doe", student.lastName);
        assertEquals(3.8, student.gpa);
    }

    @Test
    void testGetStudentByNameNotFound() {
        HashMap<String, Student> studentMap = StudentHashMap.createStudentHashMap();
        Student student = StudentHashMap.getStudentByName(studentMap, "NonExistentName");

        assertNull(student);
    }

    @Test
    void testGetStudentByNameNullMap() {
        HashMap<String, Student> studentMap = null;
        Student student = StudentHashMap.getStudentByName(studentMap, "John");

        assertNull(student);
    }

    @Test
    void testCreateStudentHashMap() {
        HashMap<String, Student> studentMap = StudentHashMap.createStudentHashMap();

        assertStudentExists(studentMap, "John", "Doe", 3.8);
        assertStudentExists(studentMap, "Alice", "Smith", 3.5);
        assertStudentExists(studentMap, "Bob", "Johnson", 3.9);
        // Add assertions for other students as needed
    }

    @Test
    void testCreateStudentHashMapEmptyMap() {
        HashMap<String, Student> studentMap = StudentHashMap.createStudentHashMap();
        studentMap.clear(); // Clear the map for this test

        assertEquals(0, studentMap.size());
    }

    private void assertStudentExists(HashMap<String, Student> studentMap, String firstName, String lastName, double gpa) {
        assertTrue(studentMap.containsKey(firstName));
        Student student = studentMap.get(firstName);
        assertNotNull(student);
        assertEquals(firstName, student.firstName);
        assertEquals(lastName, student.lastName);
        assertEquals(gpa, student.gpa);
    }
}
