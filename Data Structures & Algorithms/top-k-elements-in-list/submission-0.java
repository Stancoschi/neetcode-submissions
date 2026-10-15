class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // 2. buckets.get(f) = lista numerelor care apar de f ori
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }
        for (int num : count.keySet()) {
            buckets.get(count.get(num)).add(num);
        }

        // 3. ia numerele de la frecvența cea mai mare spre cea mai mică
        int[] res = new int[k];
        int idx = 0;
        for (int f = nums.length; f > 0 && idx < k; f--) {
            for (int num : buckets.get(f)) {
                if (idx < k)
                    res[idx++] = num;
            }
        }
        return res;
    }
}
