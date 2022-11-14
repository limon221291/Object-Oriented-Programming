/*
Encapsulation is the mechanism that binds together codes and data
and keeps both safe from outside interface and misuse.

We use access modifiers to provide encapsulation.
To use hidden variables from another class, we use getter and setter method. In setter method,
we pass a value and the setter method initializes that value into the hidden/protected variables as copy.
By using the getter method, we return the current value which was passed previously in setter method. So, now
if we want to access that private or hidden variable, we just need to pass a value into setter method from the main
method and call the getter method to use the actual value.


 Benefit:
 Hide complexity from user.
 Implement logic while updating field
 Easy to maintain
 Make variable read-only or write only

 */

package Encapsulation;

class Student{
    private String name;
    private int id;

    public void setAll(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }
}

public class Encap {
    public static void main(String[] args) {
        Student st1=new Student();
        st1.setAll("David", 212);
        System.out.println("Name: "+st1.getName()+". ID:  "+st1.getId());
        Student st2=new Student();
        st2.setAll("Mark", 288);
        System.out.println("Name: "+st2.getName()+". ID:  "+st2.getId());

    }
}
