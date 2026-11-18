package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class restoreFinishingOrder {
    public static void main(String[] args) {
        int[] order = {3,1,2,5,4};
        int[] friends = {1,3,4};

        int[] ans = recoverOrder(order,friends);
        for(int ele : ans) System.out.println(ele + " ");
    }

    private static int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];
        int j = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int friend : friends) {
            set.add(friend);
        }
        for (int k : order) {
            if (set.contains(k)) {
                arr[j++] = k;
            }
        }
        return arr;
    }
}
