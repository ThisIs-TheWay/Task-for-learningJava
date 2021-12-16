import java.util.Arrays;

public class DeleteOccurrenceTwo {

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 0, 9, 4, 4, 3, 11};
        int numberDelete = 4;

        System.out.println(Arrays.toString(remoteNumberDelete(array, numberDelete)));

    }

    public static int[] remoteNumberDelete(int[] nums, int numDelete) {

        int offset = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numDelete) {
                offset++;
            } else {
                nums[i - offset] = nums[i];
            }
        }

        return Arrays.copyOf(nums, nums.length - offset);

    }

}
