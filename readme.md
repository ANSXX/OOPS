# OOPS

## Contents
### Classes & Objects




## Classes & Objects

### CLASSES

Classes are blueprint from ehich individual objects are created. each class has its own attribute and method and can be accessed through objects

#### PROPERTIES 
* Classes doesn't take any byte if memory 
* A class is just like real life entity but it is not real world entity. Its a blue print where we can specify the functionalities 
* Class contain method and data members (attributes).
* A class can also be a nested class
* a class follow all the rules of OOPS ie.. inheritence, polymorphism, encapsulation, etc..
#### Types of Classes 
* Local Variable- defined inside the methods, constructors, or blocks are called Instance Variable
* Instance Variable- Variable which are declared within the class but outside any method. It can be accessed from inside any method, constructors or block perticular class.

* Class Variable- Variable which are declared inside the class outside any method with static keyword.

<b>Example ~</b>
```java
class Person
{
    String name;
    int age;
}

```
#### OBJECTS

Objects is a variable od type class. It is the basic concept of OOPs. A class has method & attributes this method & attribute are accessedthrough an object.<b>Thus Object is an Instance of a class</b> 

<b>Example ~</b>
```java
class firstOops{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.age=21;
        p1.name="Himanshu";
        System.out.println(p1.age+" "+p1.name);
    }
}
```