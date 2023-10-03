
package java_oop;
/*
we willlearn how to create a Method in class
to avoid the code repetition
*/
public class Student {
    String name;
    int ID;
    String section;
    String gender;
    int phone;
    
    //to create a method we have to decleared a return type then name thenends with (){}
    // IN this case we dont want anything to return so thats why we use Void return type.
    void displayInfo(){
        System.out.println(name);
        System.out.println(ID);
        System.out.println(section);
        System.out.println(gender);
        System.out.println(phone);
    
    }
}
