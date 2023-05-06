class Date{
private int day,month,year;
void setDate (int d,int m,int y){
day=d;
month=m;
year=y;
} 
void display(String msg){

    System.out.println(msg+day+"/"+month+"/"+year);

}
}
class DateTest{
    public static void main(String[] args){
        Date dob,doj;
        dob=new Date();
        doj=new Date();
 
 dob.setDate(1,1,2000);
 doj.setDate(3,5,2001);

dob.display("dob is ");    
doj.display("doj is ");
}
}
