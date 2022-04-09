public class Sorting {
    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 5, 11, 8, 0, 9, 1, 10};

        int item = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]) {
                    item = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = item;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
