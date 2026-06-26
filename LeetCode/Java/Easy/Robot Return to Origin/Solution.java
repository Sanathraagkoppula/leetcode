class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        char[] arr = moves.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x--;
            } else if (c == 'R') {
                x++;
            }
        }
        return x == 0 && y == 0;
    }
}