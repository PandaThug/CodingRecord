package com.example.coding;

/**
 * 记录leetcode日常
 */
public class Solution {

    static class ListNode {
        int val;
        CodeTop.ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    static class TreeNode {
        int val;
        CodeTop.TreeNode left;
        CodeTop.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, CodeTop.TreeNode left, CodeTop.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    /**
     * leetcode 1827.最少操作使数组递增
     */
    public int minOperations(int[] nums) {
        if (nums.length == 1) return 0;
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] <= nums[i]) {
                res += (nums[i] - nums[i + 1] + 1);
                nums[i + 1] = nums[i] + 1;
            }
        }
        return res;
    }


}
