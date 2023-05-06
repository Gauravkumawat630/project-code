 /* 
 
 import java.util.*;
class transpose{
public static void main (String args[]){
Scanner sc=new  Scanner(System.in);
int r1,c1;
System.out.print("enter how many rows");
r1=sc.nextInt();
System.out.print("enter how many Cols.");
r1=sc.nextInt();
int r2,c2;
System.out.print("enter how many rows");
r2=sc.nextInt();
System.out.print("enter how many Cols.");
c2=sc.nextInt();
if(c1 != r2){
    System.out.println("can't mult");
    System.exit(1);
}
int m1[][]=new int[r1][c1];
// input m1
for(int i=0;i<r1;i++)
for(int j=0;j<c1;j++){
System.out.print("enter "+"element"+(i+1)+","+(j+1));
 
}

int m2[][]=new int[r2][c2];
for(int i=0;i<r2;i++)
for(int j=0;j<c2;j++){
System.out.print("enter" + "element" + (i+1)+ "," +(j+1));
 m2[i][j]=sc.nextInt();
}

int m3[][]=new int[r1][c2];
for(int i=0;i<r1;i++)
for(int j=0;j<c2;j++)
for(int k=0;k<c1;k++)
// output 3
m3[i][j]+=m1[i][k]*m2[k][j];
  for (int i=0;i<r1;i++){
  for (int j=0;j<c2;j++)
    System.out.print(m3[i][j]+"\t");
    System.out.println();
}
} 
}
*/