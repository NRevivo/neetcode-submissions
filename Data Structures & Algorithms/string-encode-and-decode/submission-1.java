class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < strs.size(); i++){
            String w = strs.get(i);
            int size = w.length();

            sb.append(size).append("#").append(w);
            
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < str.length()){
            while (str.charAt(i) != '#'){
                i++;
            }
            String temp = str.substring(j, i);
            int size = Integer.parseInt(temp);

            i++;

            ans.add (str.substring (i, i + size));
            i += size;
            j = i;
        }
        return ans;

    }
}
