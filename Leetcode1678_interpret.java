public class Leetcode1678_interpret {

    public String interpret(String command){
        StringBuilder sb = new StringBuilder();
        if(command == null || command.length() == 0){
            return sb.toString();
        }
        
        for(int i = 0; i < command.length(); i++){
            char c = command.charAt(i);
            if(c == 'G'){
                sb.append('G');
            }
            if(c == '('){
                if(command.charAt(i + 1) == ')'){
                    sb.append('o');
                    i = i + 1;
                    continue;
                }
                if(command.charAt(i + 1) == 'a'){
                    sb.append("al");
                    i = i + 3;
                    continue;
                }
            }
        }
        return sb.toString();
    }
    
}
