package cn.edu.gxu;

import cn.edu.gxu.dao.impl.TeacherDaoImpl;
import cn.edu.gxu.po.Teacher;
import cn.edu.gxu.po.mycalss;
import org.junit.Test;

public class TeacherTest {

    @Test
    public void queryTeacherByIdTest(){
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        System.out.println(teacherDao.queryTeacherById(2001));
    }

    @Test
    public void queryAllTeacherTest(){
        mycalss m = new mycalss();
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        for (Teacher t: teacherDao.queryAllTeacher()){
            System.out.println(t);
        }
    }

}
