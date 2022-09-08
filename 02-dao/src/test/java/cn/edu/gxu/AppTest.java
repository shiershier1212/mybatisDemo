package cn.edu.gxu;

import cn.edu.gxu.po.Student;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

public class AppTest 
{
    // 查找测试
    @Test
    public void findStudentByIdTest(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        String sqlId = "cn.edu.gxu.dao" + "." + "queryStudentById";

        Student student = sqlSession.selectOne(sqlId, 1002);

        sqlSession.commit();

        System.out.println(student);

        sqlSession.close();
    }

    // 添加测试
    @Test
    public void addStudentTest(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        String sql = "cn.edu.gxu.dao" + "." + "addStudent";

        Student student = new Student();

        student.setId(1006);
        student.setName("zhawerngqi");
        student.setEmail("afeawerfa@qq.com");
        student.setAge(495);

        int result = sqlSession.insert(sql, student);

        sqlSession.commit();

        System.out.println(result);
    }

    // 修改测试
    @Test
    public void updateStudentTest(){

    SqlSession sqlSession = MyBatisUtil.getSqlSession();

    String sql = "cn.edu.gxu.dao" + "." + "updateStudentById";

    Student student = new Student();

    student.setId(1006);
    student.setName("zhangqi");
    student.setEmail("afe14563afa@qq.com");
    student.setAge(45);

    int result = sqlSession.update(sql, student);

    sqlSession.commit();

    System.out.println(result);
}

    // 删除测试
    @Test
    public void deleteStudentByIdTest(){

        SqlSession sqlSession = MyBatisUtil.getSqlSession();

        String sql = "cn.edu.gxu.dao" + "." + "deleteStudentById";

        int result = sqlSession.delete(sql,1005);

        sqlSession.commit();

        System.out.println(result);
    }





}
