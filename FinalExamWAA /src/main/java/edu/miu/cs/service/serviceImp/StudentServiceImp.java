package edu.miu.cs.service.serviceImp;


import edu.miu.cs.Repository.CourseRepo;
import edu.miu.cs.Repository.StudentRepo;
import edu.miu.cs.model.Course;
import edu.miu.cs.model.Student;
import edu.miu.cs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CourseRepo courseRepo;

    @Override
    public Student saveNewStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
}
