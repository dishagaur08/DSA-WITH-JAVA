public class ReverseString{
     static String reverse(String str){
        //base case when string is empty
        if(str.length()==0){
            return " ";
        }
        String oldresult = reverse(str.substring(1));
        char newresult = str.charAt(0);
        return oldresult + newresult;
     }
        public static void main(String[] args) {
            String rev = reverse("disha");
            System.out.println(rev);
        
    }
}