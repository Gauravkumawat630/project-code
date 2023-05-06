 class c{
 int x=10; // member fuction
 void m1(){
int x =20;  // local varible
System.out.println(x);  //10
System.out.println(x);
 }
 }
 class CTest {
public static void main(String [] args){
       c a1=new c();
       a1.m1();

}
 }
