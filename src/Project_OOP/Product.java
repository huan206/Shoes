package Project_OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class Product{
    private String name;
    private int product_id;
    private int size;
    private double unitPrice;
    public ArrayList<Product> shoes_list = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public Product(){}
    public Product(String name, int size, double unitPrice){
        this.name = name;
        if(size < 10)
            this.size = 10;
        else if (size > 45)
            this.size = 45;
        else
            this.size = size;
        if(unitPrice <= 0)
            this.unitPrice = 1;
        else
            this.unitPrice = unitPrice;
    }
    public Product(String name, int product_id, int size, double unitPrice){
        this.name = name;
        if(product_id <= 0)
            this.product_id = 1;
        else
            this.product_id = product_id;
        if(size < 10)
            this.size = 10;
        else if (size > 45)
            this.size = 45;
        else
            this.size = size;
        if(unitPrice <= 0)
            this.unitPrice = 1;
        else
            this.unitPrice = unitPrice;
	}
    static String [][] products = {
                          {"Adidas", "Nike", "Converse", "Puma", "Vans", "Gucci"},
                          {"42", "43", "35", "37", "38", "39"},
                          {"190000", "200000", "350000", "400000", "200000", "1000000"}};
    public void getProducts(){
        for(int k=0;k<products[0].length;k++){
            Product product = new Product(products[0][k], Integer.parseInt(products[1][k]), Double.parseDouble(products[2][k]));
            shoes_list.add(product);
        }
    }
    public int getID(int a, ArrayList<Product> shoes_list){
        for(int i = 0; i< shoes_list.size(); i++){
            if(a == shoes_list.get(i).getProduct_id()){
                return i;
            }
        }
        return -1;
    }
    public String getName(){
        return name;
    }
    public int getProduct_id(){
            return product_id;
	}
    public int getSize(){
            return size;
	}
    public double getUnitPrice(){
            return unitPrice;
	}
    public void setName(String name){
        this.name = name;
    }
    public void setProduct_id(int product_id){
            if(product_id <= 0)
            this.product_id = 1;
	else
            this.product_id = product_id;
	}
    public void setSize(int Size){
            if(size < 10)
            this.size = 10;
	else if (size > 45)
            this.size = 45;
	else
            this.size = size;
	}
    public void setUnitPrice(double unitPrice){
            if(unitPrice <= 0)
            this.unitPrice = 1;
	else
            this.unitPrice = unitPrice;
	}
    public void updateID(){
        for(int i=0;i<shoes_list.size();i++)
            shoes_list.get(i).setProduct_id(i+1);
    }
    public void addProduct(){
        System.out.println("Nhập mã sản phẩm: ");
        product_id = input.nextInt();
        input.nextLine();
        System.out.println("Nhập id: ");
        name = input.nextLine();
        System.out.println("Nhập side sản phẩm: ");
        size = input.nextInt();
        input.nextLine();
        System.out.println("Nhập đơn giá: ");
        unitPrice = input.nextDouble();
        input.nextLine();
    }
    public void displayShoes(){
        System.out.println("------------Shoes----------------");
        for(int j=0;j<shoes_list.size();j++){
            System.out.println(shoes_list.get(j));
        }}
    @Override
    public String toString(){
            return "Giày có mã: " + getProduct_id() + "\nTên: " + getName() + "\nSize: " + getSize() + "\nĐơn giá: " + getUnitPrice();
	}
}
