package alex.course.findClosestNumberToZero;

public class Solution {

    public static int findClosestNumber(int[] nums) {
        int pos, posNext, closestNumber = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == 0) {
                pos = nums[i];
            } else {
                pos = closestNumber;
            }
            posNext = nums[i + 1];
            if (Math.abs(pos) == Math.abs(posNext)) {
                if (posNext < pos) {
                    closestNumber = pos;
                } else {
                    closestNumber = posNext;
                }
            } else {
                if (Math.abs(posNext) > Math.abs(pos)) {
                    closestNumber = pos;
                } else {
                    closestNumber = posNext;
                }
            }
        }
        return closestNumber;
    }

    public static void main(String[] args) {
        int array[] = {-10,-12,-54,-12,-544,-10000};
        System.out.println(findClosestNumber(array));
    }
}
