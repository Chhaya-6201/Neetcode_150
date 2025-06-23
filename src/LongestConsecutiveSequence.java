import java.util.HashMap;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr={100,4,200,1,3,2};
        int ans=findLongestConsecutive(arr);
        System.out.println(ans);
    }

    public static int findLongestConsecutive(int[] arr){
        int longestLength=0;
        HashMap<Integer,Boolean> exploredMap=new HashMap<>();
        for(int num:arr){
            exploredMap.put(num,Boolean.FALSE);
        }
        for(int num:arr){
            int currentLength=1;
            //Check in forward direction
            int nextNum=num+1;
            while(exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)){
                currentLength++;
                exploredMap.put(nextNum,Boolean.TRUE);
                nextNum++;
            }
            // Check in reverse direction
            int prevNum=num-1;
            while(exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                currentLength++;
                exploredMap.put(prevNum,Boolean.TRUE);
                prevNum--;
            }
            longestLength=Math.max(currentLength,longestLength);
        }
        return longestLength;
    }

}
