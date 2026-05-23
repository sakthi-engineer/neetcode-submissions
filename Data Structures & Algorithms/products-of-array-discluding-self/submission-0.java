class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zc=0,idx=-1;
        int pro=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zc++;
                idx=i;
            }
            else{
                pro*=nums[i];
            }
        }
        if(zc==0){
            for(int i=0;i<nums.length;i++){
                res[i]=pro/nums[i];
            }
        }
        else if(zc==1){
            for(int i=0;i<nums.length;i++){
                res[i]=0;
            }
            res[idx]=pro;
        }
        else{
            for(int i=0;i<nums.length;i++){
                res[i]=0;
            }
        }
        return res;
    }
}