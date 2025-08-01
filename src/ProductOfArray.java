public class ProductOfArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] result=productArray(nums);
        for(int num:result){
            System.out.print(num+" ");
        }


    }
    public static int[] productArray(int[] nums){

       //Array to store left multiplication
        int[] left=new int[nums.length];

        //Array to store right multiplication
        int[] right=new int[nums.length];

        left[0]=1;
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for(int i=nums.length-2;i>-1;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        int[] ans=new int[nums.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }

}
