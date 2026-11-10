class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        ha=defaultdict(list)#if there is no strings 

        for s in strs:
            count=[0]*26 # in one string ,may be there a 26 char

            for c in s:
                count[ord(c)-ord('a')]+=1
                
            ha[tuple(count)].append(s) # tuple becouse count is an array and can't be a key for dictionary
                    
        return ha.values()

        