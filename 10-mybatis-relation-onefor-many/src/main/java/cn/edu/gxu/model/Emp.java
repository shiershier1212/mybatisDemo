package cn.edu.gxu.model;

import java.sql.Timestamp;

public class Emp {

  private long empid;
  private String ename;
  private String esex;
  private java.sql.Timestamp ehiredate;
  private double esal;
//  private String dname;//部门表里面的名字

  public Emp() {
  }

  public Emp(long empid, String ename, String esex, Timestamp ehiredate, double esal, long deptid, Dept dept, String dname) {
    this.empid = empid;
    this.ename = ename;
    this.esex = esex;
    this.ehiredate = ehiredate;
    this.esal = esal;
//    this.dname = dname;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empid=" + empid +
            ", ename='" + ename + '\'' +
            ", esex='" + esex + '\'' +
            ", ehiredate=" + ehiredate +
            ", esal=" + esal +
//            ", dname='" + dname + '\'' +
            '}';
  }

  public long getEmpid() {
    return empid;
  }

  public void setEmpid(long empid) {
    this.empid = empid;
  }

  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }

  public String getEsex() {
    return esex;
  }

  public void setEsex(String esex) {
    this.esex = esex;
  }

  public Timestamp getEhiredate() {
    return ehiredate;
  }

  public void setEhiredate(Timestamp ehiredate) {
    this.ehiredate = ehiredate;
  }

  public double getEsal() {
    return esal;
  }

  public void setEsal(double esal) {
    this.esal = esal;
  }

//  public String getDname() {
//    return dname;
//  }
//
//  public void setDname(String dname) {
//    this.dname = dname;
//  }
}
