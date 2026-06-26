class Solution {
    public int prefixCount(String[] words, String pref) {
        int c=0;
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.startsWith(pref)){
                c++;
            }
        }
    return c;
    }

}