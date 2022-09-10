package cn.edu.gxu.dao.impl;

import cn.edu.gxu.dao.TeacherDao;
import cn.edu.gxu.po.Teacher;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public Teacher queryTeacherById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        Teacher teacher = teacherDao.queryTeacherById(id);
        sqlSession.close();
        return teacher;
    }

    @Override
    public List<Teacher> queryAllTeacher() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        List<Teacher> list = teacherDao.queryAllTeacher();
        sqlSession.close();
        return list;
    }
}
