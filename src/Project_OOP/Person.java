package Project_OOP;
public abstract class Person implements Role{
    protected String name;
    protected Address address;
    protected int account_id;
    protected String role = customer;
    
    public Person(){}
    public Person(String name, int account_id, String role, Address adress){
        this.name = name;
        if(account_id <= 0)
             this.account_id = 1;
        else
             this.account_id = account_id;
        if(role == "Salesman")
            this.role = salesman;
        else if(role == "Customer")
            this.role = customer;
        else 
            this.role = customer;
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRole(String role){
        if(role == "Salesman")
            this.role = salesman;
        else if(role == "Customer")
            this.role = customer;
        else 
            this.role = customer;
    }
    public Address getAddress(){
    	return address;
    }
    public void setAddress(Address adress){
    	this.address = address;
    }
    public abstract void find(String name);
    public abstract void find(int id);
    public abstract void add();
    @Override
    public String toString(){
        return "Name: " + getName() + "\nAddress: " + getAddress(); 
    }
}
