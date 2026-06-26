class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        return getColor(coordinate1) == getColor(coordinate2);
    }
    private int getColor(String coord) {
        int col = coord.charAt(0) - 'a' + 1;
        int row = coord.charAt(1) - '0'; 
        return (col + row) % 2;
    }
}
