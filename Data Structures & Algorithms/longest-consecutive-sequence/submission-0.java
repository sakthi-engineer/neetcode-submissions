class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int cur=1,max=1;
        if(nums.length==0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                cur++;
                max=Math.max(max,cur);
            }
            else if(nums[i-1]==nums[i]){
                continue;
            }
            else{
                cur=1;
            }
           
        }
        return max;
    }
}