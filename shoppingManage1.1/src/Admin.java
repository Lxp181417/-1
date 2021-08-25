import java.util.Scanner;

public class Admin extends User {
    //管理员登录:admin，密码为ynuinfo#777
    String name1 = "admin";
    String passWord1 = "ynuinfo#777";

    public void singIn() {
        System.out.println("请输入您的密码：");
        Scanner psa = new Scanner(System.in);
        String passWorda1 = psa.next();
        if (passWorda1.equals(passWord1)) {
            System.out.println("登陆成功！");
        } else {
            System.err.println("密码错误！请重新输入。");
            main(null);
        }
    }

    //修改自身密码
    public String setSelfPassWord() {
        System.out.println("请输入原密码:");
        Scanner newPass = new Scanner(System.in);
        String passW = newPass.next();
        if (passW.equals(passWord1)) {
            passWord1 = passW;
            System.err.println("密码已经成功修改");
            Scanner nss = new Scanner(System.in);
            System.out.println("是否查看新密码：\n\t1--是\n\t0--否");
            int choose = nss.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(passWord1);
                    setSelfPassWord();//返回上一级
                    break;
                case 0:
                    setSelfPassWord();//返回上一级
            }
        } else {
            System.err.println("密码输入错误");
            setSelfPassWord();//返回上一级
        }
        return passWord1;
    }

    //修改用户密码
    public String changeCustomerPassword() {
        PassWordmg passWordmg = new PassWordmg();
        passWordmg.setNewPassword();//调用方法修改用户密码
        changeCustomerPassword();//返回上一级
        return changeCustomerPassword();
    }

    //客户管理
    public void customerManagement() {
        System.out.println("请选择你要执行的操作：");
        System.out.println("\t1--罗列客户");
        System.out.println("\t2--删除客户");
        System.out.println("\t3--搜索客户");
        CustomerMg manage = new CustomerMg();
        Scanner opr = new Scanner(System.in);
        int operate = opr.nextInt();
        switch (operate) {
            case 1:
                //罗列客户
                manage.showCustomer();
                break;
            case 2:
                //删除客户
                manage.deleteCustomer();
                break;
            case 3:
                //搜索客户
                manage.searchCustomer();
                break;
        }
    }

    //商品管理
    public void goodsManage() {
        CommodityMg commodity = new CommodityMg();
        System.out.println("请选择你要执行的操作：");
        System.out.println("\t1--添加商品信息");
        System.out.println("\t2--修改商品信息");
        System.out.println("\t3--删除商品信息");
        System.out.println("\t4--罗列商品");
        Goods good=new Goods();
        Scanner choose = new Scanner(System.in);
        int choose1 = choose.nextInt();
        switch (choose1) {
            //添加商品信息
            case 1:
                good.addGoods0();
                commodity.addGoods();
                break;
            //修改商品信息
            case 2:
                good.addGoods0();
                commodity.modifyGoodsInformation();
                break;
            //删除商品信息
            case 3:
                good.addGoods0();
                commodity.deleteGoodsInformation();
                break;
            //罗列商品
            case 4:
                good.addGoods0();
                commodity.showAllGoodsToAdmin();
                break;
        }
    }
}