package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.domain.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao dao;

    @Override
    public int addStudent(Student student) {
        int num = dao.insertStudent(student);
        return num;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = dao.selectStudents();
        return students;
    }

    @Override
    public Student queryStudentById(int id) {

        Student student = dao.selectStudentById(id);
        return student;
    }
}
