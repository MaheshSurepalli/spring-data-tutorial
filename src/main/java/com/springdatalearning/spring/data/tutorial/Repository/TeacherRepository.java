package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
