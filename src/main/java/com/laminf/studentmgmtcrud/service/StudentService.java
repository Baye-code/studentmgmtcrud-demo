package com.laminf.studentmgmtcrud.service;

import com.laminf.studentmgmtcrud.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
