package staticdemo;

public class TestJavaWkendClass {

    public static void main(String[] args) {

        JavaWkendClass morning = new JavaWkendClass();
        morning.setTotalStudent(23); // morning class size 23

        System.out.println("Morning total student" + morning.getTotalStudent());

        JavaWkendClass afternoon = new JavaWkendClass();
        afternoon.setTotalStudent(30); // afternoon class size 30
        System.out.println("Afternoon total student" + afternoon.getTotalStudent());

        System.out.println("Morning total student" + morning.getTotalStudent()); // since static variable it will not show the obj value rather show class value

        JavaWkendClass.todayStaticLesson();

    }
}
