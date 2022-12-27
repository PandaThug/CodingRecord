package com.example.coding;

import java.util.Arrays;
import java.util.Collections;

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

    /**
     * leetcode 1832.判断句子是否为全字母句
     * 全字母句 指包含英语字母表中每个字母至少一次的句子。
     * 给你一个仅由小写英文字母组成的字符串 sentence ，请你判断 sentence 是否为 全字母句 。
     * 如果是，返回 true ；否则，返回 false 。
     */
    public boolean checkIfPangram(String sentence) {
        boolean[] exist = new boolean[26];
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            exist[c - 'a'] = true;
        }
        for (boolean x : exist) {
            if (!x) {
                return false;
            }
        }
        return true;
    }

    /**
     * leetcode 1785.构成特定和需要添加的最少元素
     */
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long diff = Math.abs(sum - goal);
        return (int) ((diff + limit - 1) / limit);
    }

    /**
     * leetcode 209.长度最小的子数组
     * 滑动窗口
     */
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (end < n) {
            sum += nums[end];
            while (sum >= target) {
                ans = Math.min(ans, end-start+1);
                sum -= nums[start];
                start++;
            }
            end++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

}
