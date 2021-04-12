package com.ssm.controller;

import com.ssm.domain.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/insert.do")
    public ModelAndView doInsert(String name,Integer age){

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        int num = studentService.addStudent(student);

        ModelAndView mv = new ModelAndView();
        mv.addObject("name",name);
        mv.addObject("age",age);
        mv.addObject("num",num);
        mv.setViewName("insert");

        return mv;
    }

    @RequestMapping("/select.do")
    public ModelAndView doSelect(){

        List<Student> list = studentService.queryStudents();

        ModelAndView mv = new ModelAndView();
        mv.addObject("list",list);

        return mv;
    }

}
