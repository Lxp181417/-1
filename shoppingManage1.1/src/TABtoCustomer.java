import java.util.Scanner;

public class TABtoCustomer extends Customer {
    public void chooseAfterSignIn() {
        System.out.println("请选择您接下来的操作：");
        System.out.println("\t1--密码管理");
        System.out.println("\t2--购物车管理");
        System.out.println("\t3--支付");
        System.out.println("\t4--查看购物历史");
        System.out.println("\t5--返回");
        Scanner trd = new Scanner(System.in);
        int trend = trd.nextInt();
        switch (trend) {
            //密码管理
            case 1:
                super.setPassWord();
                break;
            //购物车管理
            case 2:
                super.shoppingMg();
                break;
                //支付
            case 3:
                super.pay();
                break;
                //购物历史
            case 4:
                super.shoppingHs();
                break;
                //返回
            case 5:
                main(null);

        }
    }
}
