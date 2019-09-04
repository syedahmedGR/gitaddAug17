package inheritance.oop;

public class TestUniversity {

    public static void main(String[] args) {

        University myUniv = new University("MIT", "MA", 2500, Boolean.TRUE);
        myUniv.setName("Penn State");
        myUniv.setLocation("Pennsylvania");
        myUniv.setPublic(true);
        myUniv.setStudentTotal(2200);

        myUniv.doTeaching();
        System.out.println( "My university info is here: "+ myUniv.getName()+ "Loc "+ myUniv.getLocation()+ " "+ myUniv.getStudentTotal()+ " "+ myUniv.getPublic() );

        Department cse = new Department();
        cse.runDepartment();
        cse.setName("Computer Sc Dept");
        cse.setStudentTotal(230);
        cse.setLocation("Main campus");
        System.out.println("Department info is here: "+ cse.getName() + " "+ cse.getLocation() + " "+ cse.getStudentTotal() );

        Faculty eeCE = new Faculty();
        eeCE.makeFaculties();
        eeCE.setName("Electrical Electronic Comp Engg..");
        eeCE.setLocation("Main Campus");
        eeCE.setStudentTotal(800);
        System.out.println("Faculty info is here: "+ eeCE.getName() + " "+ eeCE.getLocation() + " "+ eeCE.getStudentTotal() );





    }
}
