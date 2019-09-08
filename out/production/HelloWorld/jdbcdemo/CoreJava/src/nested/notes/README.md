Nested Classes:

    What are nested classes?
        - In java, it is possible to define a class within another class, 
            such classes are known as nested classes. They enable you to logically 
            group classes that are only used in one place, thus this increases the use 
            of encapsulation, and create more readable and maintainable code.
            
        - The scope of a nested class is bounded by the scope of its enclosing class. 
            
        - A nested class has access to the members, including private members, of the 
            class in which it is nested. However, reverse is not true 
                i.e. the enclosing class does not have access to the members 
                of the nested class.
                
        - A nested class is also a member of its enclosing class.
        
        - As a member of its enclosing class, a nested class can be declared private, 
            public, protected, or package private(default).
            
        Nested classes are divided into two categories:
            1. static nested class : Nested classes that are declared
                static are called static nested classes.
            2. inner class : An inner class is a non-static nested class.
            
        Ex:
        
        class OuterClass
        {
        ...
            class NestedClass
            {
                ...
            }
            
        }
        
        
        