package SlidingWindow;

//Maximum Points You can Obtain From Cards

public class MaximumPoints {

    public static void main(String[] args) {
        int[] arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        int ans=maxPoints(arr,k);
        System.out.println(ans);
    }

    public static int maxPoints(int[] arr,int k){
        int lsum=0;
        int rsum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            lsum+=arr[i];
            maxSum=lsum;
        }
        int rightIndex=arr.length-1;
        for(int i=k-1;i>=0;i--){
            lsum-=arr[i];
            rsum+=arr[rightIndex];
            rightIndex-=1;

            maxSum=Math.max(maxSum,lsum+rsum);
        }
        return maxSum;
    }





}
