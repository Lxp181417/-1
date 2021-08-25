import java.util.Scanner;

public class TABtoAdmin extends Admin {
    public void adminTrend() {
        System.out.println("请选择您接下来的操作：");
        System.out.println("\t1--修改管理员密码");
        System.out.println("\t2--修改客户密码");
        System.out.println("\t3--客户管理");
        System.out.println("\t4--商品管理");
        System.out.println("\t5--退出");
        Scanner trd1 = new Scanner(System.in);
        int trend1 = trd1.nextInt();
        switch (trend1) {
            //修改管理员密码
            case 1:
                super.setSelfPassWord();
                adminTrend();
                break;
            //修改客户密码
            case 2:
                super.changeCustomerPassword();
                adminTrend();
                break;
            //客户管理
            case 3:
                super.customerManagement();
                adminTrend();
                break;
            //商品管理
            case 4:
                super.goodsManage();
                adminTrend();
                break;
            case 5:
                System.exit(0);
        }
    }
}