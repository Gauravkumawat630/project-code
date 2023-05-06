import java.io.Console;
class Student{
private int roll;
private String name;
private int sub1,sub2;
private float per;
void getData(){
Console con=System.console();
System.out.print("roll no :");
roll=Integer.parseInt(con.readLine);
System.out.print("name:");
name=con.readLine();
System.out.print("enter marks in )2 subjest");
sub1=Integer.parseInt(con.readLine());
sub2=Integer.parseInt(con.readLine());
}
void setData(int r,String n,int a, int b){
roll = r;
name = n;
sub1 = a;
sub2 = b;
}
void calc_per(){
per=(sub1+sub2)/2.0f;
}
void display(){
System.out.println(roll+"\t"+name+"\t"+sub1+"\t"+sub2+"\t"+per+"%");
}
}
class StudentTest{
    public static void main(String [] args){    
Student s1,s2;
s1=new Student();
s2=new Student();
s1.setData(101,"ajay",100,100);
s2.setData(102,"ram",100,100);
s1.calc_per();
s2.calc_per();
System.out.println("roll\tname\tsub\tsub2\tper");
s1.display();
s2.display();
}
}
