package main.task62;

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }
        for (int i = 0, num = Math.abs(k); i < n; i++) {
            int sum = 0;
            if (k > 0) {
                int count = 1;
                int index = i + count;
                while (count <= k) {
                    sum += code[index++ % n];
                    count++;
                }
            } else {
                int count = 1;
                int index = (i == 0)? (n - 1) : (i - count);
                while (count <= num && num < n) {
                    if (index < 0){
                        index = n - 1;
                    }
                    sum += code[index--];
                    count++;
                }
            }
            result[i] = sum;
        }
        return result;
    }

    /*
    not mine solution
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {

                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                // Для k < 0: додаємо елементи перед поточним індексом
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];  // Заміна для коректного індексування
                }
            }
            result[i] = sum;
        }

        return result;
    }
     */
}

