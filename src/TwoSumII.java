public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers={2,7,11,15};
        int target=9;
        int[] ans=twoSum(numbers,target);
        for(int num:ans) {
            System.out.print(num + " ");
        }
    }
    public static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
