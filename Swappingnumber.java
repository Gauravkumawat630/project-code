class  Swappingnumber{
public static void main (String args[]){
int a=5, b=6;
swap(a,b);
}
static void swap (int x ,int y){
    int t;
    t = x;
    x = y;
    y = t;
    System.out.println("after swap values are" + x + "," + y);
    return ;
}
}
