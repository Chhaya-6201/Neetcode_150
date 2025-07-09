package SlidingWindow;
//Better Approach-->O(2N)
public class LongestSubarrayII {
    public static void main(String[] args) {
        int[] arr={2,5,20,10,10};
        int k=20;
        int ans=maxLengthSubarray(arr,k);
        System.out.println(ans);
    }
    //Better Approach ---> By Shrinking and Expanding the  window
    public static int maxLengthSubarray(int[] arr,int k){
        int maxLen=0,sum=0;
        int left=0,right=0;
        while(right<arr.length){
            sum+=arr[right];

            //Shrinking the window when condition is invalid
            while(sum>k){
                sum-=arr[left];
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }

}
