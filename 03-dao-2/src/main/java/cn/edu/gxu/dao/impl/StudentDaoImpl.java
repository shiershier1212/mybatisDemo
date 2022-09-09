package cn.edu.gxu.dao.impl;

import cn.edu.gxu.dao.StudentDao;
import cn.edu.gxu.po.Student;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public Student queryStudentById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "cn.edu.gxu.dao" + "." + "queryStudentById";
        Student student = sqlSession.selectOne(sqlId, id);
        sqlSession.commit();
        sqlSession.close();
        return student;
    }

    @Override
    public List<Student> queryAllStudent() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "cn.edu.gxu.dao" + "." + "queryAllStudent";
        List<Student> list = sqlSession.selectList(sqlId);
        sqlSession.commit();
        sqlSession.close();
        return list;
    }

    @Override
    public Integer addStudent(Student student) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sql = "cn.edu.gxu.dao" + "." + "addStudent";
        int result = sqlSession.insert(sql, student);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public Integer updateStudentById(Student student) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sql = "cn.edu.gxu.dao" + "." + "updateStudentById";
        int result = sqlSession.update(sql, student);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public Integer deleteStudentById(Integer id) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sql = "cn.edu.gxu.dao" + "." + "deleteStudentById";
        int result = sqlSession.delete(sql,id);
        sqlSession.commit();
        sqlSession.close();
        return result;
    }
}
