class matrixx{

        public static void main(String args[]){
    int a[]=new int[10];
    for(int cnt=0;cnt<10;){
    int r=(int)(Math.random()*1000)+1; //1 to 1000
    //search
    boolean found=false;
    for(int i=0;i<cnt;i++){
    if(a[i]==r){
    found=true;
    break;
    }
    }

    if(found==false){
    a[cnt++]=r;
    }
    }
        }
    }
        