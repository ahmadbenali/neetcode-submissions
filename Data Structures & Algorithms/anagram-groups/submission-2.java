class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs==null || strs.length==0) return new ArrayList<>();
        
        Map<String,List<String>> HashMap=new HashMap<>();

        for(String str:strs){
            char[] newstr=str.toCharArray();
            Arrays.sort(newstr);
            String key = new String(newstr);

            if(!HashMap.containsKey(key)){
                HashMap.put(key,new ArrayList<>());
            }
            HashMap.get(key).add(str);
        }

        return new ArrayList<>(HashMap.values());
    }
}
