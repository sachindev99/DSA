package Hashing;

import java.util.HashMap;
import java.util.Map;

public class ElementsAppearMoreThanNByKBetter {
    public static void main(String[] args) {
        int[] arr = { 30, 10, 20, 20, 20, 10, 40, 30, 30 };
        int n = arr.length;
        int k = 4;
        elementsApperar(arr, n, k);
    }

    private static void elementsApperar(int[] arr, int n, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            // if element exists in hasmap then increase its frequecy
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            // if element doesn't exist then put in in HashMap
            else if (hm.size() < k - 1) {
                hm.put(arr[i], 1);
            }

            // if HashMap is full then decrease the frequency of all the elements
            else {
                for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
                    hm.put(e.getKey(), e.getValue() - 1);
                    // if frequency becomes zero then remove that elements
                    if (e.getValue() == 0) {
                        hm.remove(e.getKey());
                    }
                }
            }
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (e.getKey() == arr[i]) {
                    count++;
                }
            }
            if (count > n / k) {
                System.out.print(e.getKey() + " ");

            }
        }
    }

}
