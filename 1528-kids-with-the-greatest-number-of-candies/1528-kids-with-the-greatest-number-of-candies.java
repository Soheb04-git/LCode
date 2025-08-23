class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleanlist = new ArrayList<>();
        int n = candies.length;
        int greatest = candies[0];
        for(int i = 0; i < n; i++){
            greatest = Math.max(greatest,candies[i]);
        }
        for(int i = 0; i < n; i++){
            if((candies[i]+extraCandies) >= greatest) booleanlist.add(true);
            else booleanlist.add(false);
        }
        return booleanlist;
    }
}