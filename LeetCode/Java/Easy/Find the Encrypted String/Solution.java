class Solution {
    public String getEncryptedString(String s, int k) {
        s.length();
        k = k % n;
        return s.substring(k) + s.substring(0, k);
    }
}
