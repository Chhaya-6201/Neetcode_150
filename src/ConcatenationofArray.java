public class ConcatenationofArray {
    
    public static int[] concatArray(int[] arr){
        int[] ans=new int[2*arr.length];
        int j=0;
        for (int k : arr) {
            ans[j++] = k;
        }
        for (int k : arr) {
            ans[j++] = k;
        }
        return ans;
    }
    
    
    public static void main(String[] args) {
        int[] arr={4,5,6,7,8,9};
        int[] result=concatArray(arr);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
