public class Searching{
    public static boolean search(int arr[],int key,int i){
        if(i>=arr.length){
            return false;
        }
        if(arr[i]==key){
            return true;
        }
        return search(arr,key,i+1);
    }

    public static int indexnum(int arr[], int key,int i){
        if(i>= arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return indexnum(arr,key,i+1);
    }
    public static void main(String args[]){
        int arr[]={1,20,32,46,70,5,6,108};
        System.out.println(search(arr,20,0));
        System.out.println(indexnum(arr,20,0));

    }
}