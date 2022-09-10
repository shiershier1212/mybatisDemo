package cn.edu.gxu.dao.impl;

import cn.edu.gxu.dao.DeptDao;
import cn.edu.gxu.model.Dept;
import cn.edu.gxu.utils.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class DeptDaoImpl implements DeptDao {
    @Override
    public List<Dept> queryAllDept() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        DeptDao deptDao = sqlSession.getMapper(DeptDao.class);
        return deptDao.queryAllDept();
    }
}
