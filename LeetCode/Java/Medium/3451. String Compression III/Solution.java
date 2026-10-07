class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int i = 0;
        while (i < n) {
            char c = word.charAt(i);
            int j = i;
            while (j < n && word.charAt(j) == c) {
                j++;
            }
            int length = j - i;
            while (length > 9) {
                sb.append("9").append(c);
                length -= 9;
            }
            sb.append(length).append(c);
            i = j;
        }
        return sb.toString();
    }
}