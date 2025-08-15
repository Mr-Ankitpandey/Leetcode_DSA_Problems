class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int n = nums.length;
        if(n==1) return new int[]{nums[0]};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] topFrequent = new int[k];
        for (int i = 0; i < k; i++) {
            topFrequent[i] = list.get(i).getKey();
        }

        return topFrequent;
    }
}
