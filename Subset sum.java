// User function Template for Java//User function Template for Java
import java.util.*;
class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        
        solve(0,0,arr,ans);
        
        Collections.sort(ans);
        return ans;
        
    }
    public void solve(int idx,int sum,int arr[],ArrayList<Integer>ans){
        if(idx == arr.length){
            ans.add(sum);
            return;
        }
        //include current element
        solve(idx+1,sum+arr[idx],arr,ans);
        //exclude current element
        solve(idx+1,sum,arr,ans);
    }
}
