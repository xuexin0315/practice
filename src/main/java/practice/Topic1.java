package practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creat By   On
 *
 * 产生10个1-100的随机数，并放到一个数组中，把数组中大于等于10的数字放到一个list集合中，并打印到控制台。
 */
public class Topic1
{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[10];
        Random ra = new Random();
        for (int i =0;i < arr.length;i++)
        {
            arr[i] = ra.nextInt(100)+1;//为什么加一
            if(arr[i]>=10)
            {
                list.add(arr[i]);
            }

        }
        System.out.println(list);

    }

}
