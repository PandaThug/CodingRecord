package com.example.coding;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void test() {
        List<Integer> ids = new ArrayList<>();
        ids.add(101);
        ids.add(107);
        ids.add(110);
        ids.add(111);
        ids.add(110);
        List<Integer> used = new ArrayList<>();
        used.add(101);
        used.add(107);
        used.add(110);
        List<Integer> can = new ArrayList<>();
        List<Integer> cant = new ArrayList<>();
        for (Integer id : ids) {
            if (used.contains(id)) {
                can.add(id);
            } else {
                cant.add(id);
            }
        }
        System.out.println(can);
        System.out.println(cant);

    }

}
