package cn.edu.gxu.dao.impl;

import cn.edu.gxu.dao.EmpDao;
import cn.edu.gxu.model.Emp;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class EmpDaoImpl implements EmpDao {

    @Override
    public List<Emp> queryAllEmp() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        EmpDao empDao = sqlSession.getMapper(EmpDao.class);
        return empDao.queryAllEmp();
    }
}
