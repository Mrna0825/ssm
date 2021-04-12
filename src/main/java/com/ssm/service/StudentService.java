package com.ssm.service;

import com.ssm.domain.Student;

import java.util.List;

public interface StudentService {

    public int addStudent(Student student);

    public List<Student> queryStudents();

    public Student queryStudentById(int id);
}
