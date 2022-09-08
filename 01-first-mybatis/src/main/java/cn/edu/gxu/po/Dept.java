package cn.edu.gxu.po;

public class Dept {

  private long deptid;
  private String dname;
  private String dloc;


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

  @Override
  public String toString() {
    return "Dept{" +
            "deptid=" + deptid +
            ", dname='" + dname + '\'' +
            ", dloc='" + dloc + '\'' +
            '}';
  }
}
