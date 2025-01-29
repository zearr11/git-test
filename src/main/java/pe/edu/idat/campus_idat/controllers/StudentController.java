package pe.edu.idat.campus_idat.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.idat.campus_idat.models.Student;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/students")
public class StudentController {

    ArrayList<Student> modelStudent = new ArrayList<>();

    public StudentController(){
        addStudents();
    }

    private void addStudents(){
        modelStudent.add(new Student(1000, "Cesar Junior", "Gamarra Rivera", "75450991"));
        modelStudent.add(new Student(1001, "Junior Luis", "Lopez Alcantara", "78976333"));
    }

    @GetMapping()
    public String goHomeStudentsView(Model stuModel) {
        stuModel.addAttribute("std", modelStudent);
        return "students/students";
    }
    
}
