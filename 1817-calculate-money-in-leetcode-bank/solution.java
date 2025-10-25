class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int mondayDeposit = 1;
        int current = mondayDeposit;

        for (int day = 1; day <= n; day++) {
            total += current; 
            current++;       

            if (day % 7 == 0) {   // end of the week
                mondayDeposit++; 
                current = mondayDeposit;
            }
        }

        return total;
    }
}

