public class Leetcode14_longestCommonPrefix {

    public static void main(String[] args) {
        String[] strs1 = new String[]{"flower", "flow", "flight"};
        // String[] strs2 = new String[]{"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs1));
        // System.out.println(longestCommonPrefix(strs2));
        // System.out.println("flight".indexOf("flo"));
        System.out.println("flight".substring(0,0));
    }

    public static String longestCommonPrefix(String[] strs){
        StringBuilder sb = new StringBuilder();
        if(strs == null || strs.length == 0){
            return sb.toString();
        }
        for(int i = 0; i < strs[0].length(); i++){
            String str = strs[0].substring(0, i + 1);
            int flag = 0;
            for(int j = 1; j < strs.length; j++){
                if(strs[j].indexOf(str) != 0){
                    flag = 1;
                    break;
                }
            }
            System.out.println(flag);
            if(flag == 0){
                sb.append(strs[0].charAt(i));
            }
            if(flag == 1){
                break;
            }
        }
        return sb.toString();
    }

    
}
