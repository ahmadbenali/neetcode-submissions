class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1; //k>=1
        int right=0;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        int min=right;//4

        while(left<=right){
            int hour=0;
            int k=left+(right-left)/2;//4
            
            for(int x:piles){
                hour+=(x + k - 1) / k;
            }

            if(hour<=h){
                min=k;
                right=k-1;
            }else{
                left=k+1;
            }
        }

        return min;
    }
}
