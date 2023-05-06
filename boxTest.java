import java.util.Scanner;
class box{
    private int feet,inch;
    box(){
    }
    box(int feet,int inch){
        this.feet=feet;
        this.inch=inch;
    }
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet:");
        feet= sc.nextInt();
        System.out.print("Enter inch:");
        inch= sc.nextInt();
 }
    void display(){
        
        System.out.println(feet+"'"+inch+"\"");
    }
    box sum(box b){  
        box t=new box();  
        t.feet=feet+b.feet;
        t.inch=inch+b.inch;
        if(t.inch>=12){
            t.feet++;
            t.inch = t.inch-12;
     
        }
      
        return t;
    }
}
public class boxTest {
    public static void main(String[] args) {
        box b1,b2,b3;
        b1=new box();
        b2=new box();
        b1.getdata();
        b2.getdata();
        b1.display();
        b2.display();
        b3=b1.sum(b2);
        System.out.print("Your Answer:");
        b3.display();
    }
    }
