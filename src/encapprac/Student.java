package encapprac;

import java.lang.String;

public class Student {

    private String firstName;
    private String lastName;
    private int age;

    public void Student(){

    }

    public void Student(String firstName, String lastName, int age){
        this.firstName =firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirsName() {
        return firstName;
    }

    public void setFirsName(String firsName) {
        this.firstName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
