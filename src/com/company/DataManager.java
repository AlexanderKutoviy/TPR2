package com.company;

import java.util.ArrayList;
import java.util.HashMap;

class DataManager {

    private DataRepository dataRepository = new DataRepository();
    private ArrayList<String> tmp = new ArrayList<>();
    private HashMap<String, Integer> hash = new HashMap<>();
    private ArrayList<String> list1 = new ArrayList<>();
    private ArrayList<String> list2 = new ArrayList<>();
    private ArrayList<String> list3 = new ArrayList<>();
    private ArrayList<String> list4 = new ArrayList<>();
    private ArrayList<String> list5 = new ArrayList<>();
    private ArrayList<String> list6 = new ArrayList<>();
    private ArrayList<Integer> city = new ArrayList<>();
    private ArrayList<Integer> toBuy = new ArrayList<>();
    private static final Integer tempH1 = -10;
    private static final Integer amountOfItems = 5;
    private static int sum = 0;

    void showAllResults() {
        dataRepository.InitializeObjects();
        getSpecificHResult();

        int i, j = 0;
        for (i = 0; i < 12; i++) {
            System.out.print("\t" + (i + 1));
        }

        while (j < 12) {
            if (tempH1 >= city.get(j)) {
                toBuy.add(0);
            } else {
                if (city.get(j) <= 0 && city.get(j) >= -9) {
                    itemsCheckEquality(list1, list2);
                    getSumOfItems(tmp);
                } else if (city.get(j) >= 1 && city.get(j) <= 10) {
                    itemsCheckEquality(list1, list3);
                    getSumOfItems(tmp);
                } else if (city.get(j) >= 11 && city.get(j) <= 20) {
                    itemsCheckEquality(list1, list4);
                    getSumOfItems(tmp);
                } else if (city.get(j) >= 21 && city.get(j) <= 30) {
                    itemsCheckEquality(list1, list5);
                    getSumOfItems(tmp);
                }
                toBuy.add(sum);
                sum = 0;
            }
            j++;

        }

    }

    private void itemsCheckEquality(ArrayList<String> l1, ArrayList<String> l2) {
        tmp.clear();
        for (int k = 0; k < amountOfItems; k++) {
            if (!l1.get(k).equals(l2.get(k))) {
                tmp.add(l2.get(k));
            }
        }
    }

    private void getSumOfItems(ArrayList<String> temporary) {
        for (int i = 0; i < temporary.size(); i++) {
            for (String key : hash.keySet()) {
                if (temporary.get(i).equals(key)) {
                    sum += hash.get(key) + 2;
                }
            }
        }
    }

    void showFinalToBuyValues() {
        System.out.println();
        for (int y = 0; y < toBuy.size(); y++) {
            System.out.print("\t" + toBuy.get(y));
        }
    }

    private void getSpecificHResult() {
        hash = dataRepository.getClothesMap();
        city = dataRepository.getArrayListCity();
        list1 = dataRepository.getArrayListH1();
        list2 = dataRepository.getArrayListH2();
        list3 = dataRepository.getArrayListH3();
        list4 = dataRepository.getArrayListH4();
        list5 = dataRepository.getArrayListH5();
        list6 = dataRepository.getArrayListH6();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataManager that = (DataManager) o;
        if (list1 != null ? !list1.equals(that.list1) : that.list1 != null) return false;
        if (list2 != null ? !list2.equals(that.list2) : that.list2 != null) return false;
        if (list3 != null ? !list3.equals(that.list3) : that.list3 != null) return false;
        if (list4 != null ? !list4.equals(that.list4) : that.list4 != null) return false;
        return list5 != null ? list5.equals(that.list5) : that.list5 == null &&
                (list6 != null ? list6.equals(that.list6) : that.list6 == null);
    }

    @Override
    public int hashCode() {
        int result = list1 != null ? list1.hashCode() : 0;
        result = 31 * result + (list2 != null ? list2.hashCode() : 0);
        result = 31 * result + (list3 != null ? list3.hashCode() : 0);
        result = 31 * result + (list4 != null ? list4.hashCode() : 0);
        result = 31 * result + (list5 != null ? list5.hashCode() : 0);
        result = 31 * result + (list6 != null ? list6.hashCode() : 0);
        return result;
    }
}