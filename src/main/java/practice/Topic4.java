package practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * Creat By   On
 *
 *
 * 双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1—33中选择；蓝色球号码从1—16中选择；请随机生成一注双色球号码。（要求同色号码不重复）
 *
 *
 *
 *
 */
public class Topic4
{
    public static void main(String[] args) {

        String[] arr = new String[7];

        //确定蓝球位置  值为0
        int flag = 0;
        Random ra =  new Random();
        int blueBallIndex = ra.nextInt(7);//[0,7)
        arr[blueBallIndex]= method1();
        for (int i = 0; i <arr.length ; i++) {
            if(i==blueBallIndex){
                continue;
            }
            arr[i]=method2();
        }
        for (String s:arr
             ) {
            System.out.println(s);

        }
    }
    public static String method1()
    {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i <16 ; i++) {
            Integer temp = i+1;
            arr.add(temp.toString());

        }
        Random ra = new Random();
        return "蓝球为："+arr.get(ra.nextInt(16));
    }
    //红球
    public static String method2()
    {
        ArrayList<String>arr= new ArrayList<>();
        for (int i = 0; i <33 ; i++) {
            Integer temp = i+1;
            arr.add(temp.toString());

        }
        Random ra = new Random();
        return "红球是："+arr.get(ra.nextInt(33));

    }


}
