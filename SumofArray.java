public class SumofArray{
    public static int sum(int arr[],int i){
        if(i==arr.length-1){
            return arr[i];
        }
        int a= sum(arr,i+1);
        return arr[i]+a;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        System.out.print(sum(arr,0));
    }
}