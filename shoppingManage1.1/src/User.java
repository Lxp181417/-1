import java.io.*;
import java.util.Scanner;
public class User {
    public static void main(String[] args) {
       try{
           System.err.println("============================");
           System.err.println("\t1--登录");
           System.err.println("\t2--注册");
           System.err.println("\t3--搜索");
           System.err.println("\t4--浏览商品");
           System.err.println("\t5--退出");
           System.err.println("请输入您的选择:");
           Scanner ch = new Scanner(System.in);
           int choose = ch.nextInt();
           Admin admin = new Admin();
           Goods good = new Goods();
           Customer customer = new Customer();
           good.addGoods0();
           TABtoAdmin TtoAdmin = new TABtoAdmin();
           PersonalInformation personalInformation=new PersonalInformation();
           ShoppingHs shoppingHs=new ShoppingHs();
           ShoppingMg shoppingMg=new ShoppingMg();
           //文本文件导入
           shoppingMg.readShoppingCar();
           shoppingHs.readShoppingHs();
           customer.readCustomerKey();
           good.acquireGoodsInformation();
           personalInformation.acquireCustomerDate();

           if (choose > 0 && choose < 6) {
               switch (choose) {
                   //登录
                   case 1:
                       System.out.println("请选择您的登录身份\n\t1--客户\n\t2--管理员");
                       Scanner read = new Scanner(System.in);
                       int reader = read.nextInt();
                       switch (reader) {
                           //客户登录
                           case 1:
                               customer. cuSignIn();
                               break;
                           //管理员登录
                           case 2:
                               admin.singIn();
                               TtoAdmin.adminTrend();
                       }
                       //注册
                   case 2:
                       //调用customer的方法
                       customer.customerRegister();
                       break;

                   //搜索商品（可以调用）
                   case 3:
                       //调用Goods类的方法
                       good.searchGoods();
                       System.out.println("是否继续搜索商品？");
                       System.out.println("\t1--继续\n\t2--退出");
                       Scanner cho = new Scanner(System.in);
                       int chi = cho.nextInt();
                       switch (chi) {
                           case 1:
                               good.searchGoods();
                               break;
                           case 2:
                               main(null);
                               break;
                       }
                       break;
                   //浏览商品
                   case 4:
                       good.showAllGoods();
                       main(null);
                       break;
                   //退出
                   case 5:
                       good.writeGoods();//先写一次文件产生源
                       personalInformation.storageCustomerDate();//产生源
                       customer.writeCustomerKey();//先写一次产生源
                       shoppingHs.writeShoppingHs();//产生源
                       shoppingMg.writeShoppingCar();//产生源
                       System.exit(0);//退出程序
               }
           } else {
               System.err.println("请重新输入菜单中的选择");
               main(null);
           }
       }catch (Exception e){
           e.printStackTrace();
       }
    }
}
