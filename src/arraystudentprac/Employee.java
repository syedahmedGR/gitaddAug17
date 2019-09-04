package arraystudentprac;

public class Employee {

    private String name;
    private int id;

   // public Employee(){}

    public Employee(int id) {
       // this.name = name;
        this.id = id;
    }

    //Employee employee = new Employee(10);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Employee[] getEmployeeArray (int employeeTotal){
        Employee[] employeeArray = new Employee[employeeTotal];
        for(int i=0; i< employeeTotal; i++){
            Employee  employee = new Employee(i+1);
            employeeArray[i] = employee;
        }
        return employeeArray;

    }

}
