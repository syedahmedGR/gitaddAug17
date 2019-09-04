package nestedclass;

public class OuterClass {

    static int staticVar = 10;

    public String name = "syed";

    InnerClassA innerClassA = new InnerClassA();
    InnerClassB innerClassB = new InnerClassB();
    InnerClassC innerClassC = new InnerClassC();




    public void outerClassMethodOA(){
        System.out.println("this is outer class method OA");
        innerClassA.innerClassMethodIA1();
        innerClassA.innerClassMethodIA2();
        innerClassB.innerClassMethodIB();


    }

    public class InnerClassA{
        private int id;

        private void innerClassMethodIA1(){
            System.out.println("this is inner class A method IA");
        }

        private void innerClassMethodIA2(){

            System.out.println("this is inner class A method IB");
        }
    }
    public class InnerClassB{
        private String dob;

       // OuterClass outerClass1 = new OuterClass();

        private void innerClassMethodIB(){
            //outerClass1.outerClassMethodOA();
            //System.out.println(outerClass1.name);
            System.out.println("this is inner class B method IB");
        }

    }

    protected class InnerClassC {

        private void innerClassCMethodIC(){
            System.out.println("this i inner class C method");
        }
    }

    static class InnerClassD {

        public void methodClassD() {
            System.out.println("this is static inner class");
            System.out.println("Static value :" + staticVar);
        }

        private static void staticMethodClassD(){

        }
    }
}
