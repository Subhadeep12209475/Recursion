import java.util.*;
public class Searching_1{
    public static ArrayList<Integer> search(ArrayList<Integer> a ,int arr[],int key,int i){
        if(i>= arr.length){
            return a;
        }
        if(arr[i]==key){
            a.add(i);
        }
        return search(a,arr,key,i+1);
    }
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
        int arr[]={2,3,4,2,3,26,7,2,9,2};
        System.out.print(search(a,arr,2,0)+" ");
    }
}