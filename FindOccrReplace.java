public class FindOccr {

    static int[] findHelper(int arr[], int index, int search, int count) {
        if (arr.length == index) {
            int result[] = new int[count];
            return result;
        }

        if (arr[index] == search) {
            arr[index] = 20;
            int result[] = findHelper(arr, index + 1, search, count + 1);
            result[count] = index;
            return result;
        } else {
            return findHelper(arr, index + 1, search, count);
        }
    }

    static int[] find(int arr[], int index, int search) {
        return findHelper(arr, index, search, 0);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 90, 10, 100, 10, 88 };
        int result[] = find(arr, 0, 10);

        for (int r : result) 
            System.out.println(r);

        System.out.println("Modified array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
