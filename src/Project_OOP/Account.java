package Project_OOP;

import static Project_OOP.Role.customer;
import static Project_OOP.Role.salesman;
import java.util.ArrayList;
import java.util.Scanner;
public class Account{
    private int account_id;
    private String userName;
    private String passWord;
    private String role = customer;
    Scanner input = new Scanner(System.in);
    public ArrayList<Account> listAccount = new ArrayList<>();
    public Account(){}
    public Account(int account_id, String userName, String passWord, String role){
        if(account_id <= 0)
            this.account_id = 1;
        else
            this.account_id = account_id;
        this.userName = userName;
        this.passWord = passWord;
        if("Salesman".equals(role) || "salesman".equals(role))
            this.role = salesman;
        else if("Customer".equals(role) || "customer".equals(role))
            this.role = customer;
        else 
            this.role = customer;
	}
    public void getAcounts(ArrayList<Account> la){
        for(int k=0;k<la.size();k++){
            this.listAccount.add(la.get(k));
        }
    }
    public int getID(int a, ArrayList<Account> listAccount){
        for(int i = 0; i< listAccount.size(); i++){
            if(a == listAccount.get(i).getAccount_id()){
                return i;
            }
        }
        return -1;
    }
    public void updateID(ArrayList<Account> listAccount){
        for(int i=0;i<listAccount.size();i++)
            listAccount.get(i).setAccount_id(i + 1);
    }
    public int getAccount_id(){
        return account_id;
	}
    public String getUserName(){
        return userName;
}
    public String getPassWord(){
        return passWord;
	}
    public String getRole(){
        return role;
    }
    public void setAccount_id(int account_id){
        if(account_id <= 0)
            this.account_id = 1;
        else
            this.account_id = account_id;
	}
    public void setUserName(String userName){
        this.userName = userName;
	}
    public void setPassWord(String passWord){
        this.passWord = passWord;
	}
    public void setRole(String role){
        if("Salesman".equals(role) || "salesman".equals(role))
            this.role = salesman;
        else if("Customer".equals(role) || "customer".equals(role))
            this.role = customer;
        else 
            this.role = customer;
    }
    public void addAccount(){
        System.out.println("Nhập tên tài khoản dăng nhập: ");
        setUserName(input.nextLine());
        System.out.println("Nhập mật khẩu: ");
        setPassWord(input.nextLine());
        String pass;
        do{
            System.out.println("Nhập lại mật khẩu: ");
            pass=input.nextLine();
        }while(pass.equals(getPassWord())==false);
        System.out.println("Vai trò (Salesman or Customer): ");
        setRole(input.nextLine());
    }
    @Override
    public String toString(){
        return " Mã tài khoản: " + getAccount_id() + "\nTên đăng nhập: " +getUserName() + " Mật khẩu: " + getPassWord();
    }
}
