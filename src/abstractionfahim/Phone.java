package abstractionfahim;

public interface Phone {

    public void call();

    public void text(String message);

    public void browsing();

    /*  interface can have
    default void doesSomething(){
        System.out.println("Hello world");
    }

    static void doesSomethingElse(){
        System.out.println("Hello world2");
    }

    */

}
