package btvn;

public class nv {
    private static int ID = 1;
    private int id;
    private String name;
    private String Age;
    private String Salary;
    private String Brithday;
    private String gender;

    public nv() {
    }

    public nv(String name, String age, String salary, String brithday, String gender) {
        this.id = ID++;
        this.name = name;
        Age = age;
        Salary = salary;
        Brithday = brithday;
        this.gender = gender;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int ID) {
        nv.ID = ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getBrithday() {
        return Brithday;
    }

    public void setBrithday(String brithday) {
        Brithday = brithday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "nv{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                ", Brithday='" + Brithday + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }


}