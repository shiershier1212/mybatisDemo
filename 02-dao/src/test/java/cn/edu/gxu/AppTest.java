package cn.edu.gxu;

import cn.edu.gxu.po.Student;
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
        String config = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        }catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

//        String sqlId = "cn.edu.gxu.mapper" + "." + "findStudentById";

        String sqlId2 = "cn.edu.gxu.mapper" + "." + "findStudentByName";
//        Student student = sqlSession.selectOne(sqlId, 1002);

        Student student = sqlSession.selectOne(sqlId2,"张三");

        sqlSession.commit();

        System.out.println(student);

        sqlSession.close();
    }

    // 添加测试
    @Test
    public void addStudentTest(){
        String config = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        }catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sql = "cn.edu.gxu.mapper" + "." + "addStudent";

        Student student = new Student();

        student.setId(1005);
        student.setName("zhangqi");
        student.setEmail("afeafa@qq.com");
        student.setAge(45);

        int result = sqlSession.insert(sql, student);

        sqlSession.commit();

        System.out.println(result);
    }

    // 修改测试
    @Test
    public void updateStudentTest(){
    String config = "mybatis-config.xml";
    InputStream inputStream = null;
    try {
         inputStream = Resources.getResourceAsStream(config);
    }catch (IOException e){
        e.printStackTrace();
    }
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlSession = sqlSessionFactory.openSession();

    String sql = "cn.edu.gxu.mapper" + "." + "updateStudentById";

    Student student = new Student();

    student.setId(1005);
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
        String config = "mybatis-config.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(config);
        }catch (IOException e){
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        String sql = "cn.edu.gxu.mapper" + "." + "deleteStudentById";

        int result = sqlSession.delete(sql,1005);

        sqlSession.commit();

        System.out.println(result);
    }





}
