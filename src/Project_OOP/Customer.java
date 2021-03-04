package Project_OOP;
import java.util.*;
public class Customer extends Person{
    private int customer_id;
    private String phoneNumber;
    private String email;
    Scanner input = new Scanner(System.in);
    public Customer (){}
    public Customer (String name,int account_id, String role, Address address, int customer_id, String phoneNumber, String email){
        	super(name, account_id, role, address);
        	if(customer_id <= 0)
            this. customer_id = 1;
        else
            this. customer_id = customer_id;
        this.phoneNumber = phoneNumber;
        this.email = email;
        	}
    public int getCustomer_id (){
        return customer_id;
	}
    public String getPhoneNumber(){
        return phoneNumber;
	}
    public String getEmail(){
        return email;
	}
    public void setId(int customer_id){
        if(customer_id <= 0)
            this. customer_id = 1;
        else
            this.customer_id = customer_id;
	}
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
	}
    public void setEmail(String email){
        this.email = email;
	}
    @Override
    public void add(){
        System.out.println("Nhập tên khách hàng: ");
        super.name = input.nextLine();
        System.out.println("Nhập id: ");
        customer_id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập số điện thoại: ");
        phoneNumber = input.nextLine();
        System.out.println("Nhập email: ");
        email = input.nextLine();
    }
    @Override
    public void find(String name){
        if(name == this.name){
            System.out.println("Tên: " + getName()+ "(" + getCustomer_id() +  ")\nĐịa chỉ: " + super.getAddress() + "\nSĐT: " + getPhoneNumber()+ " Email: " + getEmail());
	}
        else 
            System.out.println("Không có Salesman nào tên: " + name);
    }
    @Override
    public void find(int id){
        if(id == this.customer_id){
            System.out.println("Tên: " + getName()+ "(" + getCustomer_id() +  ")\nĐịa chỉ: " + super.getAddress() + "\nSĐT: " + getPhoneNumber()+ " Email: " + getEmail());
	}
        else 
            System.out.println("Không có Salesman có id: " + id);
    }
}
