import java.util.Arrays;
class callbyvalue {
int x,y;
}
class Callbyvalue {
void swap(callbyvalue d2){
int t=d2.x;
d2.x=d2.y;
d2.y=t;
}
}
class BTest{
public static void main (String[] args){

B b2=new B();
callbyvalue d1=new callbyvalue();
d1.x=7;
d1.x=8;
b2.swap (d1);
System.out.println(d1.x+","+d1.y);
}
} 