import java.util.Scanner;
class Sort{
public static void main(String args[]){
int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter how many elements");
n = sc.nextInt();
int a[] = new int[n];
//input array
for(int i=0;i<n;i++){
System.out.print("Enter element " + (i+1) + " ");
a[i] = sc.nextInt();
}
//sorting
for(int i=0;i<n-1;i++)
for(int j=i+1;j<n;j++)
if(a[i] > a[j]){
int t=a[i];
a[i] = a[j];
a[j] = t;
}
//output
for(int i=0;i<n;i++)
System.out.println(a[i]);
}
}