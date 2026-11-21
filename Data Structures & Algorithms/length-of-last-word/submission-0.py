class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        arr=s.split(" ")
        res=[i.rstrip() for i in arr if i!=""]
        return len(res[-1])
        