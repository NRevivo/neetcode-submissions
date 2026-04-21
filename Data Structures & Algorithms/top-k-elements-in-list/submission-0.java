class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int temp = map.get(nums[i]) + 1;
                map.put(nums[i], temp);
            }else{
                map.put(nums[i], 1);
            }
        }
        
        List <Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort ((a,b) -> b.getValue() - a.getValue());
        int[] ans = new int[k];

        for (int i = 0; i < k; i++){
            ans[i] = list.get(i).getKey();
        }
        return ans;
        
    }
}
