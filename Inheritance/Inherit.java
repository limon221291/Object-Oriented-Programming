/*
Inheritance is the process by which one object acquires the properties of another object.
It is the way to form new classes using classes that have already been defined.

By the definition of inheritance, we can assume that the existing class is the parent class and new class is the
child class. Child class can access parent class attributes/methods. This is why inheritance is actually used for.

Java uses “extends” keyword to show inheritance relationship. Example:
class Child extends Parent{

}

The class that is extended is a superclass
 Other terms: parent class, base class, ancestor class

 The extended class is a subclass of its superclass
 Other terms: child class, extended class, derived class

 Inheritance provides a powerful and natural
 mechanism for organizing and structuring your
 software

 It is intended to help reuse existing code with
 little or no modification.



 */


package Inheritance;

class Parent{
    public int pVar=10;

    public void parentMethod() {
        System.out.println("Parent method");
    }
}

class Child extends Parent{
    public int cVar=5;

    public void childMethod() {
        parentMethod();
        System.out.println("In child pVar= "+pVar+"  cVar= "+cVar);
    }
}


public class Inherit {
    public static void main(String[] args) {
        Child example=new Child();

        example.childMethod();
    }
}
