
class Solution {
    public boolean search(int[] nums, int target) {
        int st = 0;
        int ed = nums.length - 1;

        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (nums[mid] == target) {
                return true;
            }

            // Duplicates make it impossible to identify the sorted half
            if (nums[st] == nums[mid] && nums[mid] == nums[ed]) {
                st++;
                ed--;
            }

            // Left half is sorted
            else if (nums[st] <= nums[mid]) {
                if (nums[st] <= target && target < nums[mid]) {
                    ed = mid - 1;
                } else {
                    st = mid + 1;
                }
            }

            // Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[ed]) {
                    st = mid + 1;
                } else {
                    ed = mid - 1;
                }
            }
        }

        return false;
    }
}
