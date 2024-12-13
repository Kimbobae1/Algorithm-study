class Solution {
    public int solution(int k, int[][] dungeons) {
        return explore(k, dungeons, 0);
    }

    private int explore(int k, int[][] dungeons, int count) {
        int maxCount = count;

        for (int i = 0; i < dungeons.length; i++) {
            if (dungeons[i][0] <= k) {
                int temp = dungeons[i][0];
                int cost = dungeons[i][1];
                dungeons[i][0] = Integer.MAX_VALUE;

                maxCount = Math.max(maxCount, explore(k - cost, dungeons, count + 1));

                dungeons[i][0] = temp;
            }
        }

        return maxCount;
    }
}