class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()) return false;

        int[] result={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

        for(int i=0;i<s.length();i++){
            result[s.charAt(i)-'a']+=1;
            result[t.charAt(i)-'a']-=1;
        }

        for(int num : result){
            if(num!=0)return false;
        }
        return true;
        
    }
}
