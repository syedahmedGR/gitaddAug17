Enums:

        - Enumerations serve the purpose of representing a group
        of named constants in a programming language. 
        
        - The main objective of enum is to define our own data types(Enumerated Data Types).
    
        - Enum declaration can be done outside a Class or inside a Class but not inside a Method.
    
    Why use enums?

        - You should always use enums when a variable (especially a method parameter) 
        can only take one out of a small set of possible values. Examples would be 
        things like type constants (contract status: "permanent", "temp", "apprentice"), 
        or flags ("execute now", "defer execution").
      
        -  If you use enums instead of integers (or String codes), you increase compile-time 
        checking and avoid errors from passing in invalid constants, and you document 
        which values are legal to use.
        
        
    Why can't enums constructors be public or protected?
   
        - Think of Enums as a class with a finite number of instances. 
         There can never be any different instances beside the ones you initially declare.
        
   