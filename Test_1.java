
package java_oop;
/*
Test_1-any number will refers the class and its main function calling for this 
course to understand the concept of OOP very easily 
in this case Test_1 will represent the Teacher class

TO CREATE AN OBECT OF ANY CLASS WE HAVE TO FOLLOW ->
{    CLASS NAME OBJECT NAME = new CLASS NAME();  }
*/

public class Test_1 {
    public static void main(String[] args) {
        Teacher T1 = new Teacher();// object declearing and creating 
        T1.name ="Safrid bhuEyan";
        T1.gender ="MALE";
        T1.phone =015751151454;
        
        System.out.println(T1.name);
        System.out.println(T1.gender);
        System.out.println(T1.phone);
        
        System.out.println();
        Teacher T2 = new Teacher();// object declearing and creating 
        T2.name ="Tasnim JAhan";
        T2.gender ="FEMALE";
        T2.phone =151454;
        
        System.out.println(T2.name);
        System.out.println(T2.gender);
        System.out.println(T2.phone);
               
    }
}
