class Solution:

    def encode(self, strs: List[str]) -> str:
        newstr=""
        for i in strs:
            newstr=newstr+str(len(i))+'#'+i
        return newstr

    def decode(self, s: str) -> List[str]:
        res=[]
        i=0

        while i<len(s):
            j=i
            while s[j]!='#':
                j+=1
            num=int(s[i:j])
            i=j+1
            j=i+num
            res.append(s[i:j])
            i=j
        return res
