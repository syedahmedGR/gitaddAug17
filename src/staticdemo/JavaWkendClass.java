package staticdemo;

// this class is to show a demo of using STATIC METHOD
public class JavaWkendClass {

    public static int totalStudent;   // declaring the static variable so that we can

    public int getTotalStudent() {
        return totalStudent;
    }

    public void setTotalStudent(int totalStudent) {
        this.totalStudent = totalStudent;
    }

    public static void todayStaticLesson(){
        System.out.println("Todays lesson was on how to use STATIC KEYWORD on method");

    }
}
