class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = candies[0];
        for(int x : candies){
            if(x > greatest) greatest = x;
        }
        List<Boolean> booleanlist = new ArrayList<>();
        for(int i = 0; i < candies.length; i++){
            if((candies[i]+extraCandies) >= greatest) booleanlist.add(true);
            else booleanlist.add(false);
        }
        return booleanlist;
    }
}