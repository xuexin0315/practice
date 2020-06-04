package practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Creat By   On
 *
 * 已知数组存放一批QQ号码，QQ号码最长为11位，最短为
 * 5位String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"}。
 *
 * 将该数组里面的所有qq号都存放在LinkedList中，将list中重复元素删除，
 * 将list中所有元素分别用迭代器和增强for循环打印出来。
 *
 *
 */
public class Topic3 {

    public static void main(String[] args) {

        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};

        LinkedList<String> list = new LinkedList<>(new HashSet<>(Arrays.asList(strs)));
        //迭代
        Iterator<String> it = list.iterator();
        //为什么用while
        while(it.hasNext()){
            System.out.println(it.next());
        }
       /* //增强for
        for (String s: list
             ) {
            System.out.println(s);
            
        }*/

    }





}
