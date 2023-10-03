
package java_oop;

/*
THis one is for Student class
*/
public class Test_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        s1.name="sfrid";
        s1.ID= 80;
        s1.section="A";
        s1.gender="MAle";
        s1.phone= 5425445;
   
        
        s2.name="TAmanna";
        s2.ID= 82;
        s2.section="B";
        s2.gender="FEMAle";
        s2.phone= 25445;
        

        
        s3.name="Sifat";
        s3.ID= 97;
        s3.section="C";
        s3.gender="MAle";
        s3.phone= 566945;
       
        s1.displayInfo();
        
        System.out.println();
        
        s2.displayInfo();
        
        System.out.println();
        
        s3.displayInfo();
    }
}
