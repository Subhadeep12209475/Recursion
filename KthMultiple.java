public class KthMultiple{
    public static void multiple(int n,int k){
        int ans=0;
        if(k==1){
            System.out.print(n*k);
            return;
        }
        multiple(n,k-1);
        System.out.print(" "+n*k);
    }
    public static void main(String args[]){
        int n=5;
        int k=4;
        multiple(n,k);
    }
}