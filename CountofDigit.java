public class CountofDigit{
    public static int sod(int n){
        if(n>=0 && n< 9){
            return n;
        }
        return sod(n/10)+1;
    }
    public static void main(String args[]){
        int n=123456789;
        System.out.print(sod(n));
    }
}