package cn.edu.gxu.dao.impl;

import cn.edu.gxu.dao.TeacherDao;
import cn.edu.gxu.po.Teacher;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public List<Teacher> queryAllTeacher() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        TeacherDao teacherDao = sqlSession.getMapper(TeacherDao.class);
        return teacherDao.queryAllTeacher();
    }
}
