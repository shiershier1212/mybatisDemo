package cn.edu.gxu;

import cn.edu.gxu.dao.impl.StudentDaoImpl;
import cn.edu.gxu.po.Student;
import java.util.List;

import org.junit.Test;

public class AppTest 
{
    // 查找测试
    @Test
    public void findStudentByIdTest(){
        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println(studentDao.queryStudentById(1002));
    }

    // 查找所有学生测试
    @Test
    public void findAllStudentTest(){
        StudentDaoImpl studentDao = new StudentDaoImpl();
        List<Student> list = studentDao.queryAllStudent();
        for(Student stu:list){
            System.out.println(stu);
        }
    }

    // 添加测试
    @Test
    public void addStudentTest(){
        StudentDaoImpl studentDao = new StudentDaoImpl();
        Student student = new Student();
        student.setName("afssf");
        student.setEmail("afsafd@qq.com");
        student.setAge(1233);
//        studentDao.addStudent(student);

        for(int i=0;i<10;i++)
        {
            studentDao.addStudent(student);
            student.setId(0);
        }


        System.out.println(student.getId());
    }

    // 修改测试
    @Test
    public void updateStudentTest(){
        Student student = new Student();
        student.setId(1006);
        student.setName("zhangqi");
        student.setEmail("afe14563afa@qq.com");
        student.setAge(45);
        StudentDaoImpl studentDao = new StudentDaoImpl();
        if(studentDao.updateStudentById(student)==1){
            System.out.println("修改成功！");
        }else
        {
            System.out.println("修改失败！");
        }
}

    // 删除测试
    @Test
    public void deleteStudentByIdTest(){
        StudentDaoImpl studentDao = new StudentDaoImpl();
        System.out.println(studentDao.deleteStudentById(1007));
    }

}
