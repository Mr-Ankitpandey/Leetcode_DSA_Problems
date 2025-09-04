class Solution {
    public int findClosest(int x, int y, int z) {

        int XDistance = Math.abs(z - x);
        int YDistance = Math.abs(z - y);

        if (XDistance < YDistance) return 1;  
        else if (YDistance < XDistance) return 2; 
        else return 0;  
    }
}

