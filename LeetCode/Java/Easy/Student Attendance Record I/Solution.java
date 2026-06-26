class Solution {
    public boolean checkRecord(String s) {
        int ab=0;
        int i;
        char arr[]=s.toCharArray();
        for(i=0;i<.length;i++){
            char c = arr[i];
            if(c=='A') ab++;
            if(ab>=2){
                return false;
            }
            if(s.contains("LLL")){
                return false;
            }
        }
        return true;
    }
}