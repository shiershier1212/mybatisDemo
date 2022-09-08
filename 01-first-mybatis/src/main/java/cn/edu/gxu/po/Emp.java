package cn.edu.gxu.po;


public class Emp {

  private long empid;
  private String ename;
  private String esex;
  private java.sql.Timestamp ehiredate;
  private double esal;
  private long deptid;


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


  public java.sql.Timestamp getEhiredate() {
    return ehiredate;
  }

  public void setEhiredate(java.sql.Timestamp ehiredate) {
    this.ehiredate = ehiredate;
  }


  public double getEsal() {
    return esal;
  }

  public void setEsal(double esal) {
    this.esal = esal;
  }


  public long getDeptid() {
    return deptid;
  }

  public void setDeptid(long deptid) {
    this.deptid = deptid;
  }

  @Override
  public String toString() {
    return "Emp{" +
            "empid=" + empid +
            ", ename='" + ename + '\'' +
            ", esex='" + esex + '\'' +
            ", ehiredate=" + ehiredate +
            ", esal=" + esal +
            ", deptid=" + deptid +
            '}';
  }
}
