package goalForOffer;


/**
 * @author iverdon
 * @date 2020/9/17 20:14
 */
public class FiftyThree {
    public int GetNumberOfK(int[] nums, int K) {
        int first = binarySearch(nums,K);
        int last = binarySearch(nums,K+1);
        return (first == nums.length || nums[first] != K) ? 0 : last-first;
    }

    public int binarySearch(int[] nums, int K){
        return 0;
    }
}
