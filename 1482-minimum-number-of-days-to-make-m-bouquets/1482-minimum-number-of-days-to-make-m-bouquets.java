class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

                if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        // Find the minimum and maximum bloom day
        for (int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        // Binary Search
        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                high = mid;      // Try a smaller day
            } else {
                low = mid + 1;   // Need more days
            }
        }

        return low;
    }

    // Check if we can make at least m bouquets in 'days' days
    private boolean canMake(int[] bloomDay, int m, int k, int days) {

        int flowers = 0;
        int bouquets = 0;

        for (int bloom : bloomDay) {

            if (bloom <= days) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;   // Flowers are used in one bouquet
                }

            } else {
                flowers = 0;       // Sequence is broken
            }
        }

        return bouquets >= m;
    }
}

