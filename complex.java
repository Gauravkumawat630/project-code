import java.util.Scanner;
class complex{
private int  real,imag;
    complex(){
    }
complex(int real ,int imag){
this.real=real;
this.imag=imag;
}
void getdata(){
Scanner sc =new Scanner ("System.in");
System.out.print("enter imag");
real=sc.nextInt();
System.out.print("enter imag");
imag=sc.nextInt();
}
void display (){
if (imag>=0)
System.out.println(real+"+"+imag+"i");
else
System.out.println(real+"+"+imag+"i");
}
complex sum (complex c){
complex t=new complex();
t.real=real+c.real;
t.real=real+c.imag;
return t;
}
complex mult(complex c){
complex t=new complex();
t.real=real*c.real-imag*c.imag;
t.real=real*c.imag+c.real*imag;
return t;
}
}
class complexTest{
public static void main(String []args){
complex c1,c2,c3,c4;
c1=new complex();
c2=new complex();
c1.getdata();
c2.getdata();
c3=c1.sum(c2);
System.out.print("sum is");
c3.display();
c4=c1.mult(c2);
System.out.print("mult is ");
c4.display();
}
}