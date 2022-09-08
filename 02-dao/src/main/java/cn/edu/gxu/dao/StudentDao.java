package cn.edu.gxu.dao;

import cn.edu.gxu.po.Student;

public interface StudentDao {
    Student queryStudentById(Integer id);
    int addStudent(Student student);
    int updateStudentById(Student student);
    int deleteStudentById(Integer id);
}
