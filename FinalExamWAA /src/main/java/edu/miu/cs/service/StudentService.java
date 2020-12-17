package edu.miu.cs.service;

import edu.miu.cs.model.Course;
import edu.miu.cs.model.Student;

import java.util.List;

public interface StudentService {
    Student saveNewStudent(Student student);

    List<Course> getAllCourses();

    List<Student> getAllStudents();
}
