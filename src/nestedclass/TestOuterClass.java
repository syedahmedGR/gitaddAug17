package nestedclass;

public class TestOuterClass {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        outerClass.outerClassMethodOA();
        OuterClass.InnerClassD innerClassD = new OuterClass.InnerClassD();
        innerClassD.methodClassD();
    }
}
