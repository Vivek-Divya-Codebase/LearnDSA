package Arrays;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length; int index=0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[index++]=nums[i];


            }

        }

        return index;
    }

    public static void main(String args[]) {

        System.out.println(removeElement(new int[]{3,2,2,3}, 3));
    }
}
