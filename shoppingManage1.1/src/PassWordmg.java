import java.util.Scanner;

public class PassWordmg extends Customer{
    public String setNewPassword(){
        super.addCustomer0();
        System.err.println("正在修改用户密码！");
        System.out.println("请输入需要修改密码用户的用户名：");
        Scanner nma=new Scanner(System.in);
        String nameS=nma.next();
        int address=customerName.indexOf(nameS);//定位用户地址
       try{
           if(customerName.contains(nameS)){
               System.out.println("请输入修改后的密码：");
               Scanner newPw=new Scanner(System.in);
               String newPassWord=newPw.next();
               System.out.println("请再次输入密码确认：");
               Scanner newPw1=new Scanner(System.in);
               String newPassWord1=newPw1.next();
               if(newPassWord.equals(newPassWord1)){
                   cusPassword.set(address,newPassWord);
                   return setNewPassword();
               }else {
                   System.err.println("两次密码不一致，请检查后再次输入！");
                   setNewPassword();
               }

           }else{
               System.err.println("用户名输入错误或用户不存在，请检查后再次输入");
           }
       }catch (Exception e){
           e.printStackTrace();
       }
        return setNewPassword();
    }
}
