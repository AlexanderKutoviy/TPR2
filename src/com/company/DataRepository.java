package com.company;

import java.util.ArrayList;
import java.util.HashMap;

class DataRepository {
    // hashmap for clothes - name and the price of clothes
    private static HashMap<String, Integer> clothes = new HashMap<>(17);
    private static ArrayList<String> h1 = new ArrayList<>(5);
    private static ArrayList<String> h2 = new ArrayList<>(5);
    private static ArrayList<String> h3 = new ArrayList<>(5);
    private static ArrayList<String> h4 = new ArrayList<>(5);
    private static ArrayList<String> h5 = new ArrayList<>(5);
    private static ArrayList<String> h6 = new ArrayList<>(5);
    private static ArrayList<Integer> Birobidgan = new ArrayList<>(12);
    // amount of items
    private static final int amount = 17;
    private static String[] items = new String[amount];

    ArrayList<String> getArrayListH1() {
        return h1;
    }

    ArrayList<String> getArrayListH2() {
        return h2;
    }

    ArrayList<String> getArrayListH3() {
        return h3;
    }

    ArrayList<String> getArrayListH4() {
        return h4;
    }

    ArrayList<String> getArrayListH5() {
        return h5;
    }

    ArrayList<String> getArrayListH6() {
        return h6;
    }

    ArrayList<Integer> getArrayListCity() {
        return Birobidgan;
    }

    HashMap<String, Integer> getClothesMap() {
        return clothes;
    }

    static {
        {
            items[0] = "Blayzer";
            items[1] = "Bushlat";
            items[2] = "Vatni shtani";
            items[3] = "Vetnamki";
            items[4] = "Jeans";
            items[5] = "Cap";
            items[6] = "Sneakers";
            items[7] = "Jacket";
            items[8] = "Palto";
            items[9] = "Rukavichki";
            items[10] = "Svetr";
            items[11] = "Shirt";
            items[12] = "T-shirt";
            items[13] = "Shoes";
            items[14] = "Choboty";
            items[15] = "Shapka";
            items[16] = "Shorts";
        }
    }

    void InitializeObjects() {
        // hashMap
        clothes.put(items[0], 6);
        clothes.put(items[1], 48);
        clothes.put(items[2], 24);
        clothes.put(items[3], 6);
        clothes.put(items[4], 12);
        clothes.put(items[5], 6);
        clothes.put(items[6], 12);
        clothes.put(items[7], 24);
        clothes.put(items[8], 36);
        clothes.put(items[9], 6);
        clothes.put(items[10], 12);
        clothes.put(items[11], 6);
        clothes.put(items[12], 6);
        clothes.put(items[13], 18);
        clothes.put(items[14], 24);
        clothes.put(items[15], 12);
        clothes.put(items[16], 6);
        // h1
        h1.add(items[15]);
        h1.add(items[1]);
        h1.add(items[9]);
        h1.add(items[2]);
        h1.add(items[14]);
        // h2
        h2.add(items[15]);
        h2.add(items[8]);
        h2.add(items[9]);
        h2.add(items[4]);
        h2.add(items[14]);
        // h3
        h3.add(items[5]);
        h3.add(items[7]);
        h3.add("");
        h3.add(items[4]);
        h3.add(items[13]);
        // h4
        h4.add("");
        h4.add(items[10]);
        h4.add("");
        h4.add(items[4]);
        h4.add(items[6]);
        // h5
        h5.add(items[15]);
        h5.add(items[11]);
        h5.add("");
        h5.add(items[2]);
        h5.add(items[6]);
        // h6
        h6.add(items[15]);
        h6.add(items[12]);
        h6.add("");
        h6.add(items[16]);
        h6.add(items[3]);
        // city
        Birobidgan.add(-23);
        Birobidgan.add(-19);
        Birobidgan.add(-9);
        Birobidgan.add(3);
        Birobidgan.add(11);
        Birobidgan.add(17);
        Birobidgan.add(20);
        Birobidgan.add(18);
        Birobidgan.add(12);
        Birobidgan.add(2);
        Birobidgan.add(-11);
        Birobidgan.add(-21);
    }
}