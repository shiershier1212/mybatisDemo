package cn.edu.gxu.dao;

import cn.edu.gxu.po.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {

    Student queryStudentById(Integer id);

    List<Student> queryStudentByNameOrAge(@Param("myname") String myname, @Param("myage") Integer myage);

    List<Student> queryAllStudent();

    Integer addStudent(Student student);

    Integer updateStudentById(Student student);

    Integer deleteStudentById(Integer id);
}
