public class MonotonicArray {

    private static boolean sol(int[] nums) {

        int dir = 0;
        for (int i = 1; i < nums.length; i++) {
            if (dir == 0 && nums[i] < nums[i - 1])
                dir = -1;
            else if (dir == 0 && nums[i] > nums[i - 1])
                dir = 1;
            else if (dir == 1 && nums[i] < nums[i - 1] || dir == -1 && nums[i] > nums[i - 1])
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println(sol(nums));
    }
}
