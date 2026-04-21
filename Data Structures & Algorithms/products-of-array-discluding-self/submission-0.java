class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref = new int [nums.length];
        int[] suf = new int [nums.length];

        Arrays.fill(pref, 1);
        Arrays.fill(suf, 1);

        for (int i = nums.length - 2 ; i >= 0; i--){
            suf [i] = nums [i + 1] * suf [i + 1];
        }

        for (int i = 1; i < nums.length; i++){
            pref [i] = nums [i - 1] * pref[i - 1];
        }

        for (int i = 0; i < nums.length; i++){
            pref [i] = pref[i] * suf[i];
        }

        return pref;
    }
}  