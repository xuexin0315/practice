package practice;

import java.util.ArrayList;

/**
 * Creat By   On
 *
 *
 * 定义一个方法listTest(ArrayList<Integer> al, Integer s)，
 * 要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。
 */
public class Topic2 {


    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(55);
        arrayList.add(57);
        arrayList.add(36);
        System.out.println("57的索引值为："+listTest(arrayList,57));

    }
    public static int listTest(ArrayList<Integer>ar,Integer s){

        for (int i = 0; i <ar.size() ; i++) {
            if (ar.get(i) == s) {
                return i;

            }
        }
        return -1;
    }





}
