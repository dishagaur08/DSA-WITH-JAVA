public class FindInArray {
    static boolean IsFind(int []arr, int index,int search){
        if(arr.length == index){
            return false;
        }
        if(arr[index]==search){
            return true;

        }
        return IsFind(arr, index+1, search);
    }
    public static void main(String[] args) {
        int arr[]= { 10,30,48,57,28};
        System.out.println(IsFind(arr, 0, 48)? " element is present in array": " element not present in array");
    }
}
