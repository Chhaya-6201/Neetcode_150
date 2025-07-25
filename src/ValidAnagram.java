import java.util.HashMap;

public class ValidAnagram {
    public static boolean findValidAnagram(String s,String t){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            else if(map.get(ch)==1){
                map.remove(ch);
            }else{
                map.put(ch,map.get(ch)-1);
            }
        }
        return (map.isEmpty());
    }

    public static void main(String[] args) {
    String s="abc";
    String t="bca";
    boolean ans=findValidAnagram(s,t);
    System.out.println(ans);
    }
}
