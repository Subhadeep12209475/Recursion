public class ReverseString{
    public static String reverse(String str,int index){
        if(index==str.length()){
            return "";
        }
        String small= reverse(str,index+1);
        return small+str.charAt(index);
    }
    public static void main(String args[]){
        String str="Subha";
        System.out.print(reverse(str,0));
    }
}