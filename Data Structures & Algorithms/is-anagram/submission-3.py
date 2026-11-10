class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        
        countS ={}# to create a hashTable
        countT ={}

        for i in range(len(t)):
            countS[s[i]]=countS.get(s[i],0)+1 # the get is for when the table is empty and we don't wanna error
            countT[t[i]]=countT.get(t[i],0)+1

        return countS==countT

        
        