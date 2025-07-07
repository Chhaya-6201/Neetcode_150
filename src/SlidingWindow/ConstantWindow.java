package SlidingWindow;

//Maximum Sum of K consecutive elements

public class ConstantWindow {
    public static void main(String[] args) {
        int[] arr={-1,2,3,3,4,5,-1};
        int k=4;
        int ans=maxConsecutiveSumK(arr,k);
        System.out.println(ans);
    }
    public static int maxConsecutiveSumK(int[] arr,int k){
        int left=0;
        int right=k-1;
        int sum=0;
        int maxSum;
        for(int i=left;i<=right;i++){
             sum+=arr[i];
        }
        maxSum=sum;
        while(right<arr.length-1){
            sum=sum-arr[left];
            left++;
            right++;

            sum=sum+arr[right];
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}
