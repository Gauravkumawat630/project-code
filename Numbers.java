import java.util.Scanner;
 class Numbers {
private int x,y;
void setData (int a,int b){
x =a;
y=b;
}
void swap(){
int t;
t =x;
x=y;
y=t;
}
void getdata(){
Scanner sc = new  Scanner(System.in);
    System.out.println ("entet frist value");
    x=sc.nextInt();
System.out.println ("entet second value");
y=sc.nextInt(); 
}
void display(String msg){
 System.out.println(msg+" x : "+x+"\"ty:"+y);
}
 }
class NumbersTest{
 public static void main(String args[]){
   Numbers z = new Numbers();    
z.setData(5,6);
z.display("before swap:");   
z.swap();
z.display("after swap:");
}
}
