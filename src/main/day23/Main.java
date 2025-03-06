package main.day23;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{79,74,57,22}; //new int[]{5,4,3,2,1,1000000000};

        Solution solution = new Solution();
        System.out.println(solution.maxDistance(arr, 4));
    }
}
