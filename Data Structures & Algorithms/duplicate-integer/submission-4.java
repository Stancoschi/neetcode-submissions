class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> a = new HashMap<>();
        for(int num:nums){
            if(a.containsKey(num)){
                return true;
            }
            a.put(num,a.get(num+1));
        }
        return false;
    }
}