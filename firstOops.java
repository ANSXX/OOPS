class firstOops{
    public static void main(String[] args)
    {
        //HERE OBJECTD IS BEING DECLARED TO ACCESS CLASS 
        //OBJECTS ARE THE INSTANCE OF CLASS.USED TO ACCESS THE METHODS AND ATTRIBUTES.
            Person p1 = new Person();
            p1.age=21;
            p1.name="Himanshu";
            System.out.println(p1.age+" "+p1.name);
            p1.eat();
            p1.walk();
            p1.walk(2);//THIS IS KNOWN AS COMPILE TIME POLYMORPHISM AND IS POSSIBLE THROUGH METHOD OVERLOADING
    }
}


//HERE CLASS IS BEING DECLARED 
//CLASSES ARE BLUEPRINT FROM EHICH INDIVIDUAL OBJECTS ARE CREATED. EACH CLASS HAS ITS OWN ATTRIBUTE AND METHOD AND CAN BE ACCESSED THROUGH OBJECTS
class Person{
    String name;
    int age;

    void walk(){
        System.out.println(name+" is walking");
    }
    void eat(){
        System.out.println(name+" is eating");
    }
    void walk(int steps){
        System.out.println(name+" has walked "+steps);
    }
}