class Solution {
    public boolean check(char ch) {
        return ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
    }
    public String vowelsReversed(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(check(ch)){
                sb.append(ch);
            }
        }
        return sb.reverse().toString();
    }
    public String reverseVowels(String s) {
        String str = vowelsReversed(s);
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(check(ch)){
                sb.append(str.charAt(j++));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}