// Вариант решения 2 - с переприсваиванием.
public class Task2_1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 2, 3};
        int val = 3;

        System.out.println(removeElement(nums, val));

    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count += 1;
                result += 1;
            }
        }
        return result;
    }
}
