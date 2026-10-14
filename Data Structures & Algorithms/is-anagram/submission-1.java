class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl){
            return false;
        }
        Map<Character,Integer> a = new HashMap<>();
        Map<Character,Integer> b = new HashMap<>();
        for(int i=0;i<sl;i++){
            char sKey= s.charAt(i);
            char tKey= t.charAt(i);
            if(a.containsKey(sKey)){
                a.put(sKey, a.get(sKey)+1);
            } else {
                a.put(sKey, 0);
            }
            if(b.containsKey(tKey)){
                b.put(tKey, b.get(tKey)+1);
            } else {
                b.put(tKey,0);
            }
            
        }
        return a.equals(b);
    }
}
