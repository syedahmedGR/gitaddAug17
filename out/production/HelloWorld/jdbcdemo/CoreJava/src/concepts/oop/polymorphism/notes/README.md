Polymorphism:

    - Polymorphism in Java is a concept by which we can perform a single 
        action in different ways. 
    - Polymorphism is derived from 2 Greek words: poly and morphs. 
    - The word "poly" means many and "morphs" means forms.
        So polymorphism means many forms.
    - It occurs when we have many classes that are related to each other by inheritance.
        
     There are two types of polymorphism in Java: 
        1. compile-time polymorphism (method overloading)
        2. runtime polymorphism (method overriding)
        
     We can perform polymorphism in java by method overloading and method overriding.
     
     Method Overloading:
        - Overloading allows different methods to have same name, 
            but different signatures where signature can differ by 
            number of input parameters or type of input parameters or both. 
        - Overloading is related to compile time (or static) polymorphism.
     
     Method Overriding:
        - Overriding is a feature that allows a subclass or child class to provide 
            a specific implementation of a method that is already provided by one 
            of its super-classes or parent classes. 
        - When a method in a subclass has the same name, same parameters or signature 
            and same return type(or sub-type) as a method in its super-class, then 
            the method in the subclass is said to override the method in the super-class.
        - Method overriding is one of the way by which java achieve Run Time Polymorphism.
        - The version of a method that is executed will be determined by the object that 
            is used to invoke it. If an object of a parent class is used to invoke the \
            method, then the version in the parent class will be executed, 
            but if an object of the subclass is used to invoke the method, 
            then the version in the child class will be executed. 
            In other words, it is the type of the object being referred to 
            (not the type of the reference variable) that determines which version 
            of an overridden method will be executed.