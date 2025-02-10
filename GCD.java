import java.util.*;
public class GCD{
    public static int common(int x,int y){
    // int max= Integer.MIN_VALUE;
    //     for(int i=1;i < Math.max(n1,n2);i++){
    //         if(n1 % i ==0 && n2 % i==0){
    //             if(i>max){
    //                 max=i;
    //             }
    //         }
    //     }
    //     return (n1*n2)/max;

    //Another way

    // while(x%y != 0){
    //     int rem =x%y;
    //     x = y ;
    //     y= rem;
    // }
    // return y;

    // Recursion

    if(y==0){
       return x;
    }
    return common(y, x%y);
    }

    public static int lcm(int x,int y){
        int a= common(x,y);
        return(x*y)/a;
    }

    public static void main(String args[]){
        int n1=12;
        int n2= 10;
        System.out.print(lcm(n1,n2));
    }
}