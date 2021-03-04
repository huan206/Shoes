package Project_OOP;
import java.util.*;
public class Order{
    private int order_id;
    private Customer customer;
    private Salesman salesman;
    public ArrayList<Product> shoes_list = new ArrayList<>();
    public ArrayList<Integer> soluong1 = new ArrayList<>();
    public Order(){}
    public Order(int order_id, Customer customer, Salesman salesman, int numberOfProduct){
        	if(order_id <= 0)
            this.order_id = 1;
        else
            this.order_id = order_id;
        this.customer = customer;
        this.salesman = salesman;
	}
    public void setShoes(int id, ArrayList<Product> listProduct){
       Product product;
       for(int j=0;j< listProduct.size();j++){
            product=listProduct.get(j);
            if(id==product.getProduct_id()){
                this.shoes_list.add(product);
            }
       }
    }
    public void setSoLuong(int soluong){
        if(shoes_list.size() > soluong1.size()){
            soluong1.add(soluong);
        }
    }
    public int getOrder_id (){
            return order_id;
	}
    public Salesman getSalesman(){
            return salesman;
	}
    public Customer getCustomer (){
            return customer;
	}
    public double getTotal(){
        double total = 0;
        for(int i = 0; i< shoes_list.size(); i++){
            total = soluong1.get(i)*(shoes_list.get(i).getUnitPrice());
	}
        return total;
    }
    public void setOrder_id (int order_id){
        if(order_id <= 0)
            this.order_id = 1;
        else
            this.order_id = order_id;
	}
    public void setSalesman (Salesman salesman){
        this.salesman = salesman;
	}
    public void setCustomer(Customer customer){
        this.customer = customer;
	}
    public void displayOrder(ArrayList<Order> order){
        System.out.println("------------Order"+ (this.getOrder_id())+"-------");
        for(int j=0;j<shoes_list.size();j++){
            System.out.print("Tên giày: ");
            System.out.println(shoes_list.get(j).getName());
            System.out.print("Đơn giá: ");
            System.out.println(shoes_list.get(j).getUnitPrice());
            System.out.print("Số lượng đặt: ");
            System.out.println(soluong1.get(j));
            System.out.print("Tổng tiền: ");
            System.out.println(order.get(j).getTotal());
            }
    }
    @Override
    public String toString(){
        return "Hóa đơn có id(" + getOrder_id() + ") của " + getCustomer() + " do " + getSalesman() + "bán\nChi tiết: " + shoes_list.get(order_id) + "Tổng tiền: " + getTotal() ;
    }
}
