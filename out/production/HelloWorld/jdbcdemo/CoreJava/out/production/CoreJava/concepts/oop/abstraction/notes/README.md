Phone = interface
SmartPhone = abstract class
AndroidPhone & ApplePhone = sub classes of SmartPhone

Interface:

    What is an interface?
        - Interfaces specify what a class must do and not how. 
        - It is the blueprint of the class.
        - If a class implements an interface and does not provide method 
            bodies for all functions specified in the interface, 
            then class must be declared abstract.
        - To declare an interface, use interface keyword. 
            It is used to provide total abstraction. 
        - All the methods in interface are declared with empty body 
            and are public and all fields are public, static 
            and final by default. A class that implement interface 
            must implement all the methods declared in the interface. 
            To implement interface use **implements** keyword.
    
    
    Why do we use interface?
        - It is used to achieve total abstraction.
        - Since java does not support multiple inheritance in case of class, 
            but by using interface it can achieve multiple inheritance .
        - It is also used to achieve loose coupling.
        - Interfaces are used to implement abstraction. 
            So the question arises why use interfaces when we have abstract classes?
                - The reason is, abstract classes may contain non-final variables, 
                    whereas variables in interface are final, public and static.
                    
Abstraction:

    What is an abstract class?
        - An abstract class is a class which cannot be instantiated.
        - An abstract class is used by creating an inheriting subclass that 
            can be instantiated.
        -  An abstract class does a few things for the inheriting subclass:
            1. Define methods which can be used by the inheriting subclass.
            2. Define abstract methods which the inheriting subclass must implement.
            3.Provide a common interface which allows the subclass 
                to be interchanged with all other subclasses.
                
    A Java class becomes abstract under the following conditions:
        1. At least one of the methods is marked as abstract:
                ex:     public abstract void sampleMethod();
        2. The class is marked as abstract:
                ex:     abstract class SampleClass

    A common use of abstract classes is to provide an outline of a class similar
     like an interface does. But unlike an interface it can already provide 
     functionality, i.e. some parts of the class are implemented and some parts
      are just outlined with a method declaration. ("abstract")
      
    An abstract class cannot be instantiated, but you can create a concrete class 
        based on an abstract class, which then can be instantiated. 
        To do so you have to inherit from the abstract class and override 
        the abstract methods, i.e. implement them.
    

        

    
