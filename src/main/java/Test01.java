import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/7.
 */
public class Test01 {
    public static void main(String[] ager) {
        System.out.println("请输入金额:");
        Scanner input1 = new Scanner(System.in);
        double price = input1.nextDouble();
        System.out.println("请选择:1.是会员   2.不是会员");
        Scanner input2 = new Scanner(System.in);
        int type = input2.nextInt();
        if (type == 1)
        {
            if (price >= 200)
            {
                price = price * 0.75;

            }
        }
        else
        {
            if (price >= 100)
            {
                price = price * 0.9;

            }
        }
        System.out.println("最终价格是:"+price);
    }
}
