import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int idx,int nums[],List<Integer> curr,List<List<Integer>> ans){
        ans.add(new ArrayList<>(curr));

        for(int i=idx;i<nums.length;i++){
            //duplicates ko skip karo
            if(i> idx  && nums[i] == nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            backtrack(i+1,nums,curr,ans);
            curr.remove(curr.size()-1);
        }
    }
}
