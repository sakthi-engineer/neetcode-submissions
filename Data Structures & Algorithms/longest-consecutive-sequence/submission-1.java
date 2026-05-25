class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int cur=1,max=1;
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
           s.add(nums[i]);
        }
        for(int n:s){
            if(!s.contains(n+1)){
                cur=1;
            while(s.contains(n-1)){
                cur++;
                n--;
            }
                max=Math.max(max,cur);
            }
        }
        return max;
    }
}