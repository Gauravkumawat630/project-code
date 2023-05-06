class  AA {
private int x,y;
AA (){  // default zero argrument constructor
x=3;
y=8;
}
AA (int n) { // parameterized one arg .constructor
x=y=n;
}
AA (int x, int y ){ // para 2 arg.const

this.x=x;
this.y=y;
}
void display(){
System.out.println(x +"," +y);
}
}
class ATest{
public static void main (String args[]){
AA a1=new AA();
} 
void display (){
System.out.println(x+","+y );
}
}
class AATest {
public static void main (String args[]){
AA a1=new AA();
a1.display();

AA a2=new AA();
a2.display();

AA a3=new AA();
a3.display();
}
}