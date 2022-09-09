package cn.edu.gxu.dao;

import cn.edu.gxu.po.Student;

import java.util.List;

public interface StudentDao {

//    Student queryStudentById(Integer id);

    List<Student> queryAllStudent();

    Integer addStudent(Student student);

    Integer updateStudentById(Student student);

    Integer deleteStudentById(Integer id);
}
