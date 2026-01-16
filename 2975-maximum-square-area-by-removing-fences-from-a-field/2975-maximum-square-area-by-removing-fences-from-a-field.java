import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final int MOD = 1_000_000_007;

        // Add boundaries
        int[] h = Arrays.copyOf(hFences, hFences.length + 2);
        int[] v = Arrays.copyOf(vFences, vFences.length + 2);

        h[h.length - 2] = 1;
        h[h.length - 1] = m;

        v[v.length - 2] = 1;
        v[v.length - 1] = n;

        Arrays.sort(h);
        Arrays.sort(v);

        // All distances between horizontal fences
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                hs.add(h[j] - h[i]);
            }
        }

        // Check vertical distances and find max common
        long maxSide = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int dist = v[j] - v[i];
                if (hs.contains(dist)) {
                    maxSide = Math.max(maxSide, dist);
                }
            }
        }

        if (maxSide == 0) return -1;
        return (int)((maxSide * maxSide) % MOD);
    }
}
