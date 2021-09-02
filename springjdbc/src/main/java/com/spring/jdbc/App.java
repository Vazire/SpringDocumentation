package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My Program started..........." );
        // spring jdbc => JdbcTemplate
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student student = new Student();
//        INSERT
//        student.setId(666);
//        student.setName("John");
//        student.setCity("Lucknow");
//        int result = studentDao.insert(student);
//        System.out.println("student added " + result);
        
//        UPDATE
//        student.setId(666);
//        student.setName("Raj Kumar");
//        student.setCity("Pune");
//        int result = studentDao.change(student);
//        System.out.println("data changed " + result);
        
//        DELETE
//        int result = studentDao.delete(666);
//        System.out.println("deleted " + result);

//        GETTING A SINGLE ROW 
//        Student student = studentDao.getStudent(456);
//        System.out.println(student);
        
//        GETTING ALL THE RECORDS
        List<Student> students = studentDao.getAllStudents();
        for(Student s : students) {
        	System.out.println(s);
        }
    }
}
