package SlidingWindow;

//Length of Longest Subarray/Substring where <condition> {sum<=k}
//Subarray--> Any consecutive portion of the array (Single element array, whole array is also a subarray)

public class LongestSubarrayI {
    public static void main(String[] args) {
        int[] arr={2,5,1,7,10};
        int k=14;
        int ans=maxLengthSubarray(arr,k);
        System.out.println(ans);
    }
    //Brute Force ---> Generate and Sum All Subarrays
    public static int maxLengthSubarray(int[] arr,int k){
        int maxLen=0;int sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum<=k){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }

}
