package type_of_data;

/**
 * Created by fff on 17-6-1.
 */
public class PrimitiveAndString {
    public static void main(String[] args)
    {
        //下面代码是错误的，因为5是一个整数，不能直接赋给一个字符串
        //String strl = 5;
        //一个基本类型的值和字符串进行连接运算时，基本类型的值自动转换为字符串
        String str2 = 3.5f + "";
        //输出3.5
        System.out.println(str2);

        //下面语句输出7Hello！
        System.out.println(3+4+"Hello!");

        //下面语句输出Hello!34,因为Hello!+3会把3当做字符串处理
        //而后吧4当成字符串处理
        System.out.println("Hello!"+3+4);
    }
}