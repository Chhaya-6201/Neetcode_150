public class MergeStringsAlternately {
    public static void main(String[] args) {
        String str1="chhaya";
        String str2="jai";
        mergeStrings(str1,str2);
    }

    public static void mergeStrings(String str1, String str2) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < str1.length() && j < str2.length()) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(j));
            i++;
            j++;

        }
        while (i < str1.length()) {
            sb.append(str1.charAt(i));
            i++;
        }
        while (j < str2.length()) {
            sb.append(str2.charAt(j));
            j++;
        }
        System.out.print(sb);
    }
}
