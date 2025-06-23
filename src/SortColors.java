public class SortColors {
    public static void main(String[] args) {
        int[] arr={2,1,0,0,2,1,0,2,1,1,1};
        dutchFlagProblem(arr);
    }
    public static void dutchFlagProblem(int[] arr){
        int start=0;
        int mid=0;
        int end=arr.length-1;
        while(mid<=end) {
            switch (arr[mid]) {
                case 0:
                    swap(arr, start, mid);
                    start++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    swap(arr, mid, end);
                    end--;
                    break;

            }
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
    public static void swap(int[] arr,int pos1,int pos2){
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;

    }
}
