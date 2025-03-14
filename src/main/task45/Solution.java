package main.task45;

class Solution {
    public int[] finalPrices(int[] prices) {
        int size = prices.length;
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            if (i == size - 1) {
                result[i] = prices[i];
                break;
            }
            int j = i + 1;
            while (prices[j] > prices[i] && j < size - 1) {
                j++;
            }
            result[i] = (prices[j] > prices[i]) ? prices[i] : prices[i] - prices[j];
        }
        return result;
    }
}

