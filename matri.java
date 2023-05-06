import java.util.Scanner;
 class Sum{

public static void main(String args[]){
Scanner sc=new Scanner (System.in);
int roll;
String name;
float per;
System.out.print("enter roll:");
roll=sc.nextInt();
System.out.print("enter name:");
sc.skip("\r\n");
name=sc.nextLine();

System.out.print("enter per:");
per=sc.nextFloat();
System.out.println("name is" +roll);
System.out.println("name is" +name);

System.out.println("per is" +per);
sc.close();
}
}
