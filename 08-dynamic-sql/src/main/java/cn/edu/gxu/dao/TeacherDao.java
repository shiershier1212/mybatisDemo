package cn.edu.gxu.dao;

import cn.edu.gxu.po.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher queryTeacherById(Integer id);
    List<Teacher> queryAllTeacher();
}
