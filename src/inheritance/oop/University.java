package inheritance.oop;
/*
This class is the super class
 Hierarchy : University -> Faculties -> Department

 */
public class University {

    private String name;
    private String location;
    private int studentTotal;
    static boolean isPublic;

    public University(){}

    public University(String name, String location, int studentTotal, Boolean isPublic) {
        this.name = name;
        this.location = location;
        this.studentTotal = studentTotal;
        this.isPublic = isPublic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStudentTotal() {
        return studentTotal;
    }

    public void setStudentTotal(int studentTotal) {
        this.studentTotal = studentTotal;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean aPublic) {
        isPublic = aPublic;
    }

    public void doTeaching(){
        System.out.println("Do teaching");
        System.out.println(this);
    }
}
