class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i  < strs.length; i++){
            String str = strs[i];
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!map.containsKey(key)){
                List <String> val = new ArrayList<>();
                val.add(str);
                map.put(key, val);
            } else {
                List <String> val = map.get(key);
                val.add(str);
                map.put(key, val);
            }

        }

        ans = new ArrayList<>(map.values());
        return ans;
    }
}
