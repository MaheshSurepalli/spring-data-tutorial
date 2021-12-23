package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Course;
import com.springdatalearning.spring.data.tutorial.Entity.CourseMaterial;
import com.springdatalearning.spring.data.tutorial.Entity.Student;
import com.springdatalearning.spring.data.tutorial.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseRepositoryTest {
    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printAllCourses(){
        List<Course> courseList = courseRepository.findAll();
        System.out.println("Courses are :"+ courseList);
    }
    @Test
    public void saveCourseWithTeacher()
    {
        Teacher teacher = Teacher.builder()
                .firstName("Bhanu")
                .lastName("Murthy")
                .build();
        Course course = Course.builder()
                .title(".net")
                .credit(5)
                .teacher(teacher)
                .build();
        courseRepository.save(course);
    }
    @Test
    public void saveCourseWithStdentAndTeacher(){
        Student student = Student.builder()
                .firstName("Abdul")
                .lastName("Khayyum")
                .emailId("abdulkhayyum@gmail.com")
                .build();
        Teacher teacher = Teacher.builder()
                .firstName("Purna")
                .lastName("Chandra")
                .build();
        Course course = Course.
                builder()
                .title("python")
                .credit(10)
                .teacher(teacher)
                .build();
        course.addStudent(student);
        courseRepository.save(course);
    }

}