class B {
    B(){

        System.out.println("default called");
    }
    
    B(int n){
        System.out.println("parameterize called");
    }
}

class BTest{
    public static void main (String [] args){
        B b1=new B(55);
        B b2=new B(77);
    }
}
