class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        sb.append(chars[0]);
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            char curr = chars[i];
            char prev = chars[i - 1];
            if(curr == prev){
                count++;
            }else{
                if(count > 1){
                    sb.append(count);
                    count = 1;
                }
                sb.append(curr);
            }
        }
        if(count > 1){
            sb.append(count);
        }
        String compressed = sb.toString();
        for(int i = 0; i < compressed.length(); i++){
            chars[i] = compressed.charAt(i);
        }
        return sb.length();
    }
}