class name {
private int x;
void setX(int x1){
x=x1;
}
void displayX(){
System.out.println("value of x is + x");
}    
 }

class B extends A{
private int y;
void setXY(int x1 ,int y1){

set(x1);
y=y1;
}
void display(){
display();
System.out.println("value of y os +y");
}
}
class ATest 
public static void main(string args[] ){
B b1=new B();
b1.setXY(5,6);
b1.displayXY();
}



