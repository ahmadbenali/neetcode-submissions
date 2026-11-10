class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s1=new int[26];

        if(t.length()!=s.length())
            return false; 


        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        for(int i=0;i<s.length();i++){
            s1[sChars[i]-'a']++;
            s1[tChars[i]-'a']--;
        }

        for(int i=0;i<s1.length;i++)
            if(s1[i]!=0)
                return false;
        
        return true;
    }
}
