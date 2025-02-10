import java.util.*;
public class Maxvalue{
    public static int p(int arr[],int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int small=p(arr,index+1);
        return Math.max(small,arr[index]);
    }
    public static void main(String args[]){
        int arr[]={1,2,30,4,5};
        System.out.println(p(arr,0));
    }
}