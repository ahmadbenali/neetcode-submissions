class Solution:
    def isPalindrome(self, s: str) -> bool:
        pointOne=0
        pointTwo=len(s)-1


        while pointOne<pointTwo:
            while pointOne<pointTwo and not self.alph(s[pointOne]):
                pointOne+=1
            while pointTwo>pointOne and not self.alph(s[pointTwo]):
                pointTwo-=1

            if s[pointOne].lower()!=s[pointTwo].lower():
                return False
            pointOne+=1
            pointTwo-=1

        return True

    def alph(self,c):
        return (ord('A') <= ord(c) <= ord('Z') or 
                ord('a') <= ord(c) <= ord('z') or 
                ord('0') <= ord(c) <= ord('9'))
            
            
        