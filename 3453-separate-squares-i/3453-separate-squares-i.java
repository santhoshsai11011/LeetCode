class Solution {
    public double separateSquares(int[][] squares) {
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;
        double totalArea = 0;

        // Find search range and total area
        for (int[] s : squares) {
            double y = s[1];
            double len = s[2];
            low = Math.min(low, y);
            high = Math.max(high, y + len);
            totalArea += len * len;
        }

        double target = totalArea / 2.0;

        // Binary search for y
        for (int i = 0; i < 100; i++) {   // enough for precision
            double mid = (low + high) / 2.0;

            if (areaBelow(squares, mid) < target) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return low;
    }

    // Computes total area below horizontal line y = cut
    private double areaBelow(int[][] squares, double cut) {
        double area = 0;

        for (int[] s : squares) {
            double y = s[1];
            double len = s[2];

            if (cut <= y) {
                continue; // completely above
            } else if (cut >= y + len) {
                area += len * len; // fully included
            } else {
                area += (cut - y) * len; // partially included
            }
        }

        return area;
    }
}
