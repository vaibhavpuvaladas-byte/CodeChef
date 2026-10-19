# 3Sum Closest

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums` of length `n` and an integer `target`.

Find three integers at  **distinct indices**  in `nums` such that the sum is  **closest**  to `target`.

Return the sum of the three integers.

You may assume that each input would have  **exactly**  one solution.

 

 **Example 1:** 

```
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

```

 **Example 2:** 

```
Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).

```

 

 **Constraints:** 

- 3 <= nums.length <= 500
- -1000 <= nums[i] <= 1000
- -104 <= target <= 104

## Solution

**Language:** C++  
**Runtime:** 0 ms  
**Memory:** 8.2 MB  
**Submitted:** 2026-10-19T21:27:47.959Z  

```cpp
class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int n = nums.size() ;
        int result ;
        int diff = 0 , min_diff = INT_MAX ;

        sort(nums.begin() , nums.end());

        for(int i = 0 ; i<n-2 ; i++){
            int left = i+1 ;
            int right = n-1 ;

            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                diff = abs(sum - target);

                if(diff < min_diff){
                    min_diff = diff ;
                    result = sum;
                }

                if (sum == target) {
                    return sum;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }

            }
        }
        return result ;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/3sum-closest/)