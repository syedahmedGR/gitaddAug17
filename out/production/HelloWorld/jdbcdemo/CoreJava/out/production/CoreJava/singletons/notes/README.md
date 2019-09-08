Singleton

    - A singleton class is a class that can have only one object 
        (an instance of the class) at a time.
    - The Singleton's purpose is to control object creation, 
        limiting the number of objects to only one. 
    - Since there is only one Singleton instance, any instance fields 
        of a Singleton will occur only once per class, just like static fields. 
    
Singleton Class Design Pattern

    public class SingletonDemo() {

        // Variables of SingletonDemo
        private int number;
        private String name;

        // Private constructor
        // This prevents other classes from instantiating this class
        // It can only be instantiated within this class
        private SingletonDemo() {
            this.number = 5;
            this.name = "Demo";
        }
    
        // Create an instance of the singleton class
        private static SingletonDemo instance = new SingletonDemo();
    
        // Provide a global point of access to the instance
        public static SingletonDemo getInstance() {
            return instance;
        }

    }
    
    
Normal class vs Singleton class: 
    Difference in normal and singleton class in terms of instantiation is that, 
    For normal class we use constructor, whereas for singleton class 
    we use getInstance() method. (as seen from the design pattern above)
    In general, to avoid confusion we may also use the class name as method name 
    while defining this method. So, we would use the same design pattern as above but
    instead will replace the method name 'getInstance()' with the singleton class name.

    public class SingletonDemo() {
    
        ...
    
        ...
        
        ...
        
        // Provide a global point of access to the instance
            public static SingletonDemo SingletonDemo() {
            return instance;
        }
    }
    

Why do we use singleton?

    In terms of practical use Singleton patterns are used in logging, caches, 
    thread pools, configuration settings, device driver objects. 
    The intention is to create a single instance of a object of classes which 
    are expensive to create during runtime and try to reuse the same object. 
    Such objects are mainly immutable.