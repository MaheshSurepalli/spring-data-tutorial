package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
