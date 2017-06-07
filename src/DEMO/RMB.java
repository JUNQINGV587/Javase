package DEMO;

import java.util.Arrays;

/**
 * Created by fff on 17-6-7.
 */
public class RMB {

    private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr = {"十","百","千"};

    /**
     * 把一个浮点数分解成整数部分和小数部分字符串
     * @param num 需要被分解的浮点数
     * @return 分解出来的整数部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
     */

    private String[] divide(double num)

    {
        //将一个浮点数强制转换为long类型，即得到他的整数部分
        long zheng = (long)num;
        //浮点数减去整数部分，得到小数部分，小数部分乘以100后在取整得到2位小数
        long xiao = Math.round((num-zheng)*100);
        return new String[]{zheng + "",String.valueOf(xiao)};
    }

    /**
     * 把一个四位的数字字符串变成汉字字符串
     * @param numStr 需要被转换的四位数的字符串
     * @return 四位的数字字符串被转换成汉字字符串
     */

    private String toHanStr(String numStr)
    {
        String result = "";
        int numLen = numStr.length();
        //依次遍历数字字符串的每一位数字
        for (int i = 0; i < numLen; i++)
        {
            //把char类型数字转换成int型数字，因为它们的ASCII码恰好相差48
            //因此把char型数字减去48得int型数字，例如'4'被转成4
            int num = numStr.charAt(i) - 48;
            //如果不是最后一位数字。而且数字不是零，则需要添加单位（千、百、十）
            if (i != numLen - 1 && num != 0)
            {
                result += hanArr[num] + unitArr[numLen - 2 - i];
            }
            else
            {
                result += hanArr[num];
            }
        }
        return result;
    }

    public static void main (String[] args)
    {
        RMB nr = new RMB();

        System.out.println(Arrays.toString(nr.divide(484.165)));

        System.out.println(nr.toHanStr("48616"));
    }
}
