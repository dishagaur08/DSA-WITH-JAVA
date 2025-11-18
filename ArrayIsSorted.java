public class ArrayIsSorted {
   static boolean issorted(int[] arr ,int index){
     if(index==arr.length-1){
        return true;
     }
     if(arr[index]>arr[index+1]){
        return false;
     }
     return issorted(arr, index+1);
   } 
   public static void main(String[] args) {
    int arr[]= { 10,0,36,572,4,495};
    System.out.println(issorted(arr, 0)?"sorted":"not sorted");
   }
}
