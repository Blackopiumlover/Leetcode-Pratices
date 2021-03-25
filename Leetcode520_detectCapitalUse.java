public class Leetcode520_detectCapitalUse {

    public static void main(String[] args) {
        char a = 65;
        System.out.println(a);
    }
    public static boolean detectCapitalUse(String word){
        if(word == null || word.length() == 0){
            return false;
        }
        if(word.charAt(0) > 64 && word.charAt(0) < 91){
            if(word.length() == 1){
                return true;
            }
            else{
                if(word.charAt(1) > 64 && word.charAt(1) < 91){
                    for(int i = 2; i < word.length(); i++){
                        if(word.charAt(i) > 90){
                            return false;
                        }
                    }
                    return true;
                }
                else{
                    for(int i = 2; i < word.length(); i++){
                        if(word.charAt(i) > 64 && word.charAt(i) < 91){
                            return false;
                        }
                    }
                    return true;
                }
            }
            
        }
        else{
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) > 64 && word.charAt(i) < 91){
                    return false;
                }
            }
            return true;
        }
    }
    
}
