package com.example.coding;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 11; i < n; i++) {
            if (i < 100) {  // 11~99
                int gewei = i % 10;
                int shiwei = i / 10;
                if (gewei*gewei + shiwei*shiwei == i) {
                    ans.add(i);
                }
            }
            if (i >= 100 && i < 1000) {  // 三位数
                int gewei = (i % 100) % 10;
                int shiwei = (i % 100) / 10;
                int baiwei = i / 100;
                if (Math.pow(gewei, 3) + Math.pow(shiwei, 3) + Math.pow(baiwei, 3) == i) {
                    ans.add(i);
                }
            }
            if (i >= 1000 && i < 10000) {  // 四位数
                int gewei = ((i % 1000) % 100) % 10;
                int shiwei = ((i % 1000) % 100) / 10;
                int baiwei = (i % 1000) / 100;
                int qianwei = i / 1000;
                if (Math.pow(gewei, 4) + Math.pow(shiwei, 4) + Math.pow(baiwei, 4) + Math.pow(qianwei, 4) == i) {
                    ans.add(i);
                }
            }
            if (i >= 10000 && i < 100000) {  // 五位数
                int gewei = ((((i % 10000) % 1000)) % 100) % 10;
                int shiwei = (((i % 10000) % 1000) % 100) / 10;
                int baiwei = ((i % 10000) % 1000) / 100;
                int qianwei = (i % 10000) / 1000;
                int wanwei = i / 10000;
                if (Math.pow(gewei, 5) + Math.pow(shiwei, 5) + Math.pow(baiwei, 5) +
                        Math.pow(qianwei, 5) + Math.pow(wanwei, 5) == i) {
                    ans.add(i);
                }
            }
            if (i >= 100000 && i < 1000000) {  // 六位数
                int gewei = (((((i % 100000) % 10000)) % 1000) % 100) % 10;
                int shiwei = ((((i % 100000) % 10000) % 1000) % 100) / 10;
                int baiwei = ((i % 100000 % 10000) % 1000) / 100;
                int qianwei = ((i % 100000) % 10000) / 1000;
                int wanwei = (i % 100000) / 10000;
                int shiwanwei = i / 100000;
                if (Math.pow(gewei, 6) + Math.pow(shiwei, 6) + Math.pow(baiwei, 6) +
                        Math.pow(qianwei, 6) + Math.pow(wanwei, 6) + Math.pow(shiwanwei, 6) == i) {
                    ans.add(i);
                }
            }
            if (i >= 1000000 && i < 10000000) {  // 七位数
                int gewei = ((((((i % 1000000) % 100000)) % 10000) % 1000) % 100) % 10;
                int shiwei = (((((i % 1000000) % 100000) % 10000) % 1000) % 100) / 10;
                int baiwei = (((i % 1000000 % 100000) % 10000) % 1000) / 100;
                int qianwei = (((i % 1000000) % 100000) % 10000) / 1000;
                int wanwei = ((i % 1000000) % 100000) / 10000;
                int shiwanwei = (i % 1000000) / 100000;
                int baiwanwei = i / 1000000;
                if (Math.pow(gewei, 7) + Math.pow(shiwei, 7) + Math.pow(baiwei, 7) +
                        Math.pow(qianwei, 7) + Math.pow(wanwei, 7) + Math.pow(shiwanwei, 7) +
                        Math.pow(baiwanwei, 7) == i) {
                    ans.add(i);
                }
            }
        }
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.println(ans.get(i));
        }
    }
}
