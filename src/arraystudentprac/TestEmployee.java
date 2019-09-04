package arraystudentprac;

public class TestEmployee {

    public static void main(String[] args) {

        Employee[] employeeArray = getEmployeeArray(5);

        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println("The Employee id is " + ":" + employeeArray[i].getId());
        }
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
