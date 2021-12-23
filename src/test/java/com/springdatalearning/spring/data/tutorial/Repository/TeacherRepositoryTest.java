package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Course;
import com.springdatalearning.spring.data.tutorial.Entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TeacherRepositoryTest {
    @Autowired
    TeacherRepository teacherRepository;
    @Test
    public  void saveTeacherWithListOfCourses(){
        Course course1 = Course.
                    builder()
                .credit(5)
                .title("JAVA")
                .build();
        Course course2 = Course.
                builder()
                .title("Spring")
                .credit(6)
                .build();
        Teacher teacher = Teacher.
                builder()
                .firstName("Maram")
                .lastName("Srinu")
//                .courseList(List.of(course1,course2))
                .build();
        teacherRepository.save(teacher);
    }

}