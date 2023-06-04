public class StaticMethod { 
     static void method1(){ 
         System.out.println("static method"); 
     } 
     void method2(){ 
         System.out.println("non static method"); 
     } 
 } 
 class Main1{ 
     public static void main(String[] args) { 
         StaticMethod.method1(); 
         StaticMethod s1 = new StaticMethod(); 
         s1.method2(); 
     } 
 }
