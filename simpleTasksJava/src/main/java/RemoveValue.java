import java.util.Arrays;

public class RemoveValue {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 3, 7, 8, 9};

        System.out.println(Arrays.toString(removeItems(arr, 3)));
    }
    public static int[] removeItems(int[] nums, int value) {
        int offset = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                offset++;
                count += offset;
            } else {
                nums[i - offset] = nums[i];
            }
        }
        return Arrays.copyOf(nums, nums.length-count+1);
    }
}
