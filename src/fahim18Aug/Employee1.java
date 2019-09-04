package fahim18Aug;

public class Employee1 {

    private String firstName;
    private String lastName;
    private int id;
    private double  salary;

    public Employee1(){}

    public Employee1(String firstName, String lastName, int id, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void updtBank(){
        System.out.println("Bank updated...");
    }
}
