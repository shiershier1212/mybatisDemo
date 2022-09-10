package cn.edu.gxu.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory= null;
    static {
        String config ="mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(config);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //创建方法，获取SqlSession
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        if(sqlSessionFactory !=null){
            sqlSession = sqlSessionFactory.openSession();
        }
        return sqlSession;
    }
}
