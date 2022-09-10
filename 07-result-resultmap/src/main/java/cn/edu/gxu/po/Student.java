package cn.edu.gxu.po;


public class Student {

  private long id;
  private String name;
  private String email;
  private long age;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", email='" + email + '\'' +
            ", age=" + age +
            '}';
  }

  public long getAge() {
    return age;
  }

  public void setAge(long age) {
    this.age = age;
  }

}
