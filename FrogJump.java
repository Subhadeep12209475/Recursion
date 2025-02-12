import java.util.*;
public class Frog{
    public static int jump(int arr[],int i){
        //base
        if(i==arr.length-1){
            return 0;
        }
        //recursion

        int x= Math.abs(arr[i]-arr[i+1])+jump(arr,i+1);
        if(i==arr.length-2){
            return x;
        }
        int y=Math.abs(arr[i]-arr[i+2])+ jump(arr,i+2);

        //self

        int ans= Math.min(x,y);

        return ans;

    }
    public static void main(String args[]){
        int arr[]= {10,30,40,20,40,70};
        System.out.println(jump(arr,0));
    }
}