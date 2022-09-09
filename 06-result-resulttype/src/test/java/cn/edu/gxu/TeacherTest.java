package cn.edu.gxu;

import cn.edu.gxu.dao.impl.TeacherDaoImpl;
import cn.edu.gxu.po.Teacher;
import org.junit.Test;

public class TeacherTest {
    @Test
    public void queryAllTeacherTest(){
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        for (Teacher t: teacherDao.queryAllTeacher()){
            System.out.println(t);
        }
    }

}
