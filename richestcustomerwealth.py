class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        maximum=0
        for i in range(0,len(accounts)):
            a=sum(accounts[i])
            if(a>maximum):
                maximum=a
        return maximum