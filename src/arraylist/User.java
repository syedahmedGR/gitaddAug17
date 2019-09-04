package arraylist;

public class User {

    private String firstName;
    private String lastName;
    private int age;

    public User (){}
    // this constructor will assist to initialize the values( from the keyboard) I declare in the class
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // this is the getter and whatever value will be stored I have to retrive through getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}
