public class MianShiTi01_06_compressString {

    public static void main(String[] args) {
        String s1 = "aabcccccaaa";
        System.out.println(anotherMethod(s1));
    }

    public static String compressString(String S){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < S.length(); i++){
            sb.append(S.charAt(i));
            int count = 1;
            for(int j = i + 1; j < S.length(); j++){
                if(S.charAt(j) == S.charAt(i)){
                    count++;
                }
                else{
                    break;
                }
            }
            sb.append(count);
            i = i + count - 1;
        }
        return sb.toString().length() < S.length() ? sb.toString() : S;
    }

    public static String anotherMethod(String S){
        if(S == null || S.length() == 0){
            return S;
        }
        StringBuilder sb = new StringBuilder();
        char c = S.charAt(0);
        int cnt = 1;
        for(int i = 1; i < S.length(); i++){                        
            if(S.charAt(i) == c){
                cnt++;
            }
            else{
                sb.append(c);
                sb.append(cnt);
                cnt = 1;
                c = S.charAt(i);
            }
        }
        sb.append(c);
        sb.append(cnt);
        return sb.toString().length() < S.length() ? sb.toString() : S;
    }
    
}
