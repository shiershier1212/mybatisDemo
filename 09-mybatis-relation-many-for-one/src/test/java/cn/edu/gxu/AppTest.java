package cn.edu.gxu;

import cn.edu.gxu.dao.impl.EmpDaoImpl;
import cn.edu.gxu.model.Emp;
import org.junit.Test;


public class AppTest 
{

    @Test
    public void queryAllEmpTest()
    {
        EmpDaoImpl empDao = new EmpDaoImpl();
        for (Emp e:empDao.queryAllEmp())
        {
            System.out.println(e);
        }
    }


}
