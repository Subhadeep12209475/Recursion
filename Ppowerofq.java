public class Ppowerofq{
    public static int power(int p,int q){
    //     if(q==1){
    //         return p;
    //     }
    //     return power(p,q-1)*p;

    // Alternate

    if(q==0){
        return 1;
    }
    if(q%2==0){
        return power(p, q/2)* power(p,q/2);
    }else{
        return power(p, q/2)* power(p,q/2) * p;
    }
 }
    public static void main(String args[]){
        int p=2;
        int q=3;
        System.out.print(power(p,q));
    }
}