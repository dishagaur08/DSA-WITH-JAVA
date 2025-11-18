public class GST {
    static  int [] gstprices(int arr[], int index){
        if(index==arr.length){
            int gst[] =  new int[arr.length];
            return gst;
        }
         int gst []= gstprices(arr, index+1);
         gst[index] = arr[index]+ (int)(arr[index] *0.18 );
         return gst;
    }
    public static void main(String[] args) {
        int arr[] = { 199,46,369,200};
        int newprices[]=  gstprices(arr, 0);
        for(int p : newprices){
            System.out.println(p);
        }
}
}

