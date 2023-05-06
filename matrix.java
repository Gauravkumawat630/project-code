import java.io.Console;
class matrix{
    public static void main(String args[]){

        Console con= System.console();
        System.out.print("enter roll:");
        int roll=Integer.parseInt(con.readLine());
        System.out.print("enter name:");
        String name=con.readLine ();
        System.out.print("enter per:");
        float per=Float.parseFloat(con.readLine());
        System.out.println("roll is"+ roll);
        System.out.println("name is"+ name);
        System.out.println("per is"+ per);

    }
    
}
