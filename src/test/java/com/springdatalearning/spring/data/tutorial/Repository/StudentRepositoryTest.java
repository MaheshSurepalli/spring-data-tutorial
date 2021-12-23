package com.springdatalearning.spring.data.tutorial.Repository;

import com.springdatalearning.spring.data.tutorial.Entity.Gaurdian;
import com.springdatalearning.spring.data.tutorial.Entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;
    @Test
    public void saveStudent(){
        Student student = Student.builder().emailId("mahesh@gmail.com")
                .firstName("Mahesh")
                .lastName("Surepalli").build();
//                .gaurdianName("nageswararao")
//                .gaurdianEmail("nageswararao@gmail.com")
//                .gaurdianMobile("123456789").build();
        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGaurdian(){
        Gaurdian gaurdian = Gaurdian.builder()
                .name("Karthick")
                .email("karthick@gmailc.com")
                .mobile("12345679")
                .build();
        Student student = Student.builder()
                .firstName("Harsha")
                .lastName("Velagapudi")
                .emailId("harshasai62@gmail.com")
                .gaurdian(gaurdian)
                .build();
        studentRepository.save(student);
    }
    @Test
    public void printAllStudents(){
        List<Student> students = studentRepository.findAll();
        System.out.println(students);
    }
    @Test
    public void printAllStudentsWithHarsha_As_FirstName(){
        List<Student> students=studentRepository.findByFirstName("Harsha");
        System.out.println("Students with Harsha as First Name:"+students);
    }
    @Test
    public  void printAllStudentsByFirstNameHaving_sh(){
        List<Student> students = studentRepository.findByFirstNameContaining("sh");
        System.out.println("Students whose first name contains 'sh'"+students);
    }
    @Test
    public void printAllStudentsHavingAGaurdian(){
        List<Student> students = studentRepository.findByGaurdianNameNotNull();
        System.out.println("Students having a gaurdian"+students);
    }
    @Test
    public  void printAllStudentWithGivenEmailID(){
        Student student = studentRepository.getStudentByEmailAddress("karthick@gmailc.com");
        System.out.println(student);
    }
}