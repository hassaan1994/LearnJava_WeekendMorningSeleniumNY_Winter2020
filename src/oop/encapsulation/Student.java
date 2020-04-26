package oop.encapsulation;

public class Student {
    //Encapsulation: Data Hiding from public

    private String name;
    private String address;
    private String coursename;
    private String courseFee;

    public Student(){
    }

    public Student(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Student(String name, String address, String coursename) {
        this.name = name;
        this.address = address;
        this.coursename = coursename;
    }

    public Student(String name, String address, String coursename, String courseFee) {
        this.name = name;
        this.address = address;
        this.coursename = coursename;
        this.courseFee = courseFee;
    }

    // Getter Setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(String courseFee) {
        this.courseFee = courseFee;
    }
}
