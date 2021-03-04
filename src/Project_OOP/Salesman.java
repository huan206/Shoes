package Project_OOP;
import java.util.*;
public class Salesman extends Person{
    private int salesman_id;
    private double basicSalary;
    private String phoneNumber;
    private String email;
    Scanner input = new Scanner(System.in);
    public Salesman (){}
    public Salesman (String name,int account_id, String role, Address address, int Id, double basicSalary, String phoneNumber, String email){
            super(name, account_id, role, address);
            if(salesman_id <= 0)
                this.salesman_id = 1;
            else
                this.salesman_id = salesman_id;
            if(basicSalary < 1500000)
                this.basicSalary = 1500000;
            else
                this.basicSalary = basicSalary;
            }
    public int getSalesman_id (){
        return salesman_id;
	}
    public double getBasicSalary(){
        return basicSalary;
	}
    public String getPhoneNumber(){
        return phoneNumber;
	}
    public String getEmail(){
	    return email;
	}
 
    public void setSalesman_id (int salesman_id){
        if(salesman_id <= 0)
                this.salesman_id = 1;
        else
                this.salesman_id = salesman_id;
	}
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
	}
    public void setEmail(String email){
        this.email = email;
	}
    public void setBasicSalary(double basicSalary){
        if(basicSalary < 1500000)
                this.basicSalary = 1500000;
        else
                this.basicSalary = basicSalary;
	}
    @Override
    public void add(){
        System.out.println("Nhập tên người bán hàng: ");
        super.name = input.nextLine();
        System.out.println("Nhập id: ");
        salesman_id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phoneNumber = input.nextLine();
        System.out.println("Nhập email: ");
        email = input.nextLine();
    }
    @Override
    public void find(String name){
        if(name == this.name){
            System.out.println("Tên: " + getName()+ "(" + getSalesman_id() +  ")\nĐịa chỉ: " + super.getAddress() + "\nSĐT: " + getPhoneNumber()+ " Email: " + getEmail());
	}
        else 
            System.out.println("Không có Salesman nào tên: " + name);
    }
    @Override
    public void find(int id){
        if(id == this.salesman_id){
            System.out.println("Tên: " + getName()+ "(" + getSalesman_id() +  ")\nĐịa chỉ: " + super.getAddress() + "\nSĐT: " + getPhoneNumber()+ " Email: " + getEmail());
	}
        else 
            System.out.println("Không có Salesman có id: " + id);
    }
}
