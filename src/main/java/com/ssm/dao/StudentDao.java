package com.ssm.dao;

import com.ssm.domain.Student;

import java.util.List;

public interface StudentDao {

    public int insertStudent(Student student);

    public List<Student> selectStudents();

    public Student selectStudentById(int id);
}
