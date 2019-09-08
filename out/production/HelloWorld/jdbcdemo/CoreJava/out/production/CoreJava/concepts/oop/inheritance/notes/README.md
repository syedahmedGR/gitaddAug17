Grandfather = Super(parent) class
Father is a sub(child) class of Grandfather
Son is a sub(child) class of Father

This example provided here is a multiple inheritance example.

Son -> Father -> Grandfather

Son will inherit all the "public" variables and methods from 
Father and Grandfather class


You can add more sub classes that extends from Grandfather
class and have a "hierarchical inheritance"

ex: 

Father, FatherTwo, FatherThree can all extend from Grandfather


There are many types of inheritances in Java...
- Single level (ex: Class B inherits from Class A)
- Multi level (ex: Class C inherits from Class B, and Class B inherits from Class A)
- Hierarchical level (ex: Class B and C both inherit from Class A)


Java does NOT support multiple inheritance as it causes ambiguity
(ex: Class C cannot inherit from both Class A and Class B)
