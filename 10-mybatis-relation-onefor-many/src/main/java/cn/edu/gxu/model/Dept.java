package cn.edu.gxu.model;

import java.util.HashSet;
import java.util.Set;

public class Dept {

  private long deptid;
  private String dname;
  private String dloc;
  //查询部门时，一个部门可能对应多个员工，这是员工就会存储在set中，
  private Set<Emp> emps = new HashSet<>();

  public Dept() {
  }

  @Override
  public String toString() {
    return "Dept{" +
            "deptid=" + deptid +
            ", dname='" + dname + '\'' +
            ", dloc='" + dloc + '\'' +
            ", emps=" + emps +
            '}';
  }

  public Dept(long deptid, String dname, String dloc, Set<Emp> emps) {
    this.deptid = deptid;
    this.dname = dname;
    this.dloc = dloc;
    this.emps = emps;
  }

  public long getDeptid() {
    return deptid;
  }

  public void setDeptid(long deptid) {
    this.deptid = deptid;
  }

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public String getDloc() {
    return dloc;
  }

  public void setDloc(String dloc) {
    this.dloc = dloc;
  }

  public Set<Emp> getEmps() {
    return emps;
  }

  public void setEmps(Set<Emp> emps) {
    this.emps = emps;
  }
}
