public class One {

    public boolean duplicate(int[] nums, int length, int[] duplication) {
        for (int i=0; i<nums.length; i++){
            while (nums[i]!=i){
                if (nums[i] == nums[nums[i]]){
                    return true;
                }
                swap(nums,nums[i],i);
            }
        }
        return false;
    }

    private void swap(int[] nums, int num, int i) {
        int temp = num;
        nums[i] = nums[num];
        nums[num] = num;
    }
}
