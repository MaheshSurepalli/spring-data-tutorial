package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Course;
import com.springdatalearning.spring.data.tutorial.Entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourseMaterialRepositoryTest {
    @Autowired
    CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial(){
        Course course = Course.builder().credit(6).title("DS").build();
        CourseMaterial courseMaterial = CourseMaterial.builder().url("www.google.com").course(course).build();

        courseMaterialRepository.save(courseMaterial);

   }
   @Test
    public void printAllCourseMaterials(){
       List<CourseMaterial> materials = courseMaterialRepository.findAll();
       System.out.println("Materials are :"+materials);
   }
}