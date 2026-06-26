class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        int s = patterns.length;
        for (int i = 0; i < s; i++) {
            String p = patterns[i];
            if (word.contains(p)) {
                count++;
            }
        }
        return count;
    }
}