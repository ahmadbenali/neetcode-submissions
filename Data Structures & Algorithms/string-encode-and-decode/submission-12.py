class Solution:
    def encode(self, strs: List[str]) -> str:
        if strs == None:return []
        
        newString=""
        for i,n in enumerate(strs):
                newString+=n+".$."
           
        
        return newString
        # edge case [""] solved  and [ ] unsolved
        
    def decode(self, s: str) -> List[str]:
       return s.split(".$.")[:-1]
        
