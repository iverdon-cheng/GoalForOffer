package goalForOffer;

/**
 * @author iverdon
 * @date 2020/9/17 12:57
 */
public class FiftyOne {
    private long cnt = 0;
    private int[] temp;

    public int InversePairs(int[] nums) {
        temp = new int[nums.length];
        mergeSort(nums,0,nums.length-1);
        return (int) (cnt%1000000007);
    }

    private void mergeSort(int[] nums, int l, int h) {
        if (h-l < 1){
            return;
        }
        int m = l+(h-l)/2;
        mergeSort(nums,l,m);
        mergeSort(nums,m+1,h);
        merge(nums,l,m,h);
    }

    private void merge(int[] nums, int l, int m, int h) {
        int i = l, j = m+1, k = l;
        while (i <= m || j <= h){
            if (i > m){
                temp[k] = nums[j++];
            }else if (j > h){
                temp[k] = nums[i++];
            }else if (nums[i] <= nums[j]){
                temp[k] = nums[i++];
            }else {
                temp[k] = nums[j++];
                cnt += m-i+1;
            }
            k++;
        }
        for (k = l; k<=h; k++){
            nums[k] = temp[k];
        }
    }
}
