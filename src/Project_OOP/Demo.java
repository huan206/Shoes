package Project_OOP;
import java.util.*;
public class Demo {
    Scanner in = new Scanner(System.in);
    public static String chuyenInHoa(String str){ 
        String s,strOutput;
        s= str.substring(0, 1);
        strOutput= str.replaceFirst(s,s.toUpperCase()); 
        return (strOutput);
    }
    public static String chuanHoa(String strInput){ 
        String strOutput="";
        StringTokenizer strToken= new StringTokenizer(strInput," ,\t,\r"); 
        strOutput+=""+chuyenInHoa(strToken.nextToken()); while(strToken.hasMoreTokens()){
            strOutput+=" "+chuyenInHoa(strToken.nextToken());
        }
        return(strOutput);
       }
    public static void dangNhap(){
        System.out.println("\n--------Đăng nhập--------");            
        System.out.println("|            \t\t|");
        System.out.println("|1. Đăng nhập\t\t|");
        System.out.println("|2. Đăng ký  \t\t|");
        System.out.println("|0. Thoát    \t\t|");
        System.out.println("|            \t\t|");
        System.out.println("-------------------------");
    }
    public static void customers(){
        System.out.println("\n--------------Customer-------------------");            
        System.out.println("|                            \t\t|");
        System.out.println("|1. Xem giày có tại cửa hàng \t\t|");
        System.out.println("|2. Tìm giày                 \t\t|");
        //System.out.println("|3. Quản lí tài khoản        \t\t|");
        System.out.println("|0. Đăng xuất                \t\t|");
        System.out.println("|                            \t\t|");
        System.out.println("-----------------------------------------");
    }
    public static void customerBuy(){
        System.out.println("\n------------Buy------------------");            
        System.out.println("|                \t\t|");
        System.out.println("|1. Đặt mua      \t\t|");
        System.out.println("|0. Thoát        \t\t|");
        System.out.println("|                \t\t|");
        System.out.println("---------------------------------");
    }
    public static void salesmans(){
        System.out.println("\n-----------Salesman--------------");            
        System.out.println("|                    \t\t|");
        System.out.println("|1. Quản lí giày     \t\t|");
        System.out.println("|2. Quản lí tài khoản\t\t|");
        System.out.println("|3. Thống kê         \t\t|");
        System.out.println("|0. Đăng xuất        \t\t|");
        System.out.println("|                    \t\t|");
        System.out.println("---------------------------------");
    }
    public static void salesmansStatistical(){
        System.out.println("\n---------Statistical-------------");          
        System.out.println("|                     \t\t|");
        System.out.println("|1. Thống kê Đơn hàng \t\t|");
        System.out.println("|2. Thống kê Loại giày\t\t|");
        System.out.println("|0. Thoát             \t\t|");
        System.out.println("|                     \t\t|");
        System.out.println("---------------------------------");
    }
    public static void Accounts(){
        System.out.println("\n--------------Account--------------------");            
        System.out.println("|                             \t\t|");
        System.out.println("|1. Thêm tài khoản            \t\t|");
        System.out.println("|2. Xóa tài khoản             \t\t|");
        //System.out.println("|3. Thay đổi thông tin cá nhân\t\t|");
        System.out.println("|0. Thoát                     \t\t|");
        System.out.println("|                             \t\t|");
        System.out.println("-----------------------------------------");
    }
    /*public static void Accountss(){
        System.out.println("\n---------------Account-------------------");            
        System.out.println("|                             \t\t|");
        System.out.println("|1. Thay đổi thông tin cá nhân\t\t|");
        System.out.println("|2. Đổi mật khẩu              \t\t|");
        System.out.println("|0. Thoát                     \t\t|");
        System.out.println("|                             \t\t|");
        System.out.println("-----------------------------------------");
    }*/
    public static void Products(){
        System.out.println("\n--------------Product--------------------");            
        System.out.println("|                             \t\t|");
        System.out.println("|1. Thêm giày                 \t\t|");
        System.out.println("|2. Xóa giày                  \t\t|");
        //System.out.println("|3. Chỉnh sửa thông tin       \t\t|");
        System.out.println("|0. Thoát                      \t\t|");
        System.out.println("|                             \t\t|");
        System.out.println("-----------------------------------------");
    }
    public static void Orders(ArrayList<Order> orders,Order Order, Product shoes){
        Scanner input = new Scanner(System.in);
        int i= orders.size();
        char c;
                    do{ 
                    orders.add(Order);
                    orders.get(i).setOrder_id(i);
                    System.out.print("Nhập mã giày: ");
                    orders.get(i).setShoes(input.nextInt(),shoes.shoes_list);
                    System.out.print("Nhập sô lượng: ");
                    orders.get(i).setSoLuong(input.nextInt());
                    System.out.print("Bạn có muốn mua thêm giày(Y or N): ");
                    input.nextLine();
                    c=input.nextLine().charAt(0);
                    }while (c=='y');
                   System.out.println("--------------------------------------");
    }
    public static void ThanhToan(ArrayList<Order> order){
            Scanner input = new Scanner(System.in);
            int id;
            char c;
            do{
                int kt=0;
                System.out.print("Nhập mã Order cần thanh toán:");
                id=input.nextInt();
                for(int j=0;j<order.size();j++){
                    if(order.get(j).getOrder_id()==id){
                            order.get(j).displayOrder(order);
                            kt=1;
                            break;}} 
                if(kt==0)
                System.out.print("Không tồn tại");
                System.out.print("Bạn có muốn thanh toán Order khác không(Y or N): ");
                     input.nextLine();
                     c=input.nextLine().charAt(0);
                }while(c=='y');
                System.out.println("--------------------------------------");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Account a = new Account();
        Account admin = new Account(1, "admin", "admin", "Salesman");
        Product b = new Product();
        Order Order =new Order();
        ArrayList<Account> listAccount = new ArrayList<>();
        ArrayList<Product> listProduct = new ArrayList<>();
        ArrayList<Order> listOrder = new ArrayList<>();
        listAccount.add(admin);
        b.getProducts();
        b.updateID();
        int x;
        do{
            dangNhap();
            x = in.nextInt();
            in.nextLine();
            switch(x){
            case 1:
                System.out.println("Tài khoản: ");
                String user = in.nextLine();
                System.out.println("Mật khẩu:  ");
                String pass = in.nextLine();
                System.out.println("Vai trò (Salesman or Customer): ");
                String role = in.nextLine();
                chuanHoa(role);
                int kt = 0;
                    if("".equals(user) || "".equals(pass) || "".equals(role)){
                        System.out.println("Vui lòng nhập đầy đủ thông tin: ");
                    }
                    else{ 
                        for(int i = 0; i < listAccount.size(); i++){
                            if(user.equals(listAccount.get(i).getUserName()) && pass.equals( listAccount.get(i).getPassWord())){
                                if(role.equalsIgnoreCase("Salesman") && listAccount.get(i).getRole().equalsIgnoreCase("Salesman")){
                                    System.out.println("Đăng nhập thành công !!!");
                                    do{
                                            salesmans();
                                            x=in.nextInt();
                                            switch(x){
                                                case 1: 
                                                    do{
                                                        Products();
                                                        x=in.nextInt();
                                                        switch(x){
                                                            case 1:
                                                                b.addProduct();
                                                                listProduct.add(b);
                                                                break;
                                                            case 2:
                                                                System.out.println("Nhập id giày bạn muốn xóa: ");
                                                                int m = in.nextInt();
                                                                if(b.getID(m, b.shoes_list)==-1){
                                                                    System.out.println("Không tồn tại giày có id: " + m);
                                                                    break;}
                                                                else
                                                                    b.shoes_list.remove(b.getID(m, b.shoes_list));
                                                                break;
                                                            /*case 3:
                                                                //Cập nhật thông tin giày
                                                                break;*/
                                                        }
                                                    }while(x != 0);
                                                    x = -1;
                                                    break;
                                                case 2: 
                                                    do{
                                                        Accounts();
                                                        x=in.nextInt();
                                                        switch(x){
                                                            case 1:
                                                                if(x==1){
                                                                    a.addAccount();                            
                                                                    System.out.println("Đăng ký tài khoản thành công!");
                                                                    listAccount.add(a);
                                                                    a.getAcounts(listAccount);
                                                                    a.updateID(listAccount);
                                                                }
                                                                break;
                                                            case 2:
                                                                System.out.println("Nhập id tài khoản bạn muốn xóa: ");
                                                                int m = in.nextInt();
                                                                if(a.getID(m, a.listAccount)==-1){
                                                                    System.out.println("Không tồn tại tài khoản có id: " + m);
                                                                    break;
                                                                }
                                                                else
                                                                    listAccount.remove(a.getID(m,listAccount));
                                                                break;
                                                            /*case 3: 
                                                                //Thay đổi thông tin cá nhân
                                                                break;*/
                                                        }
                                                    }while(x != 0);
                                                    x=-1;
                                                    break;
                                                case 3: 
                                                    do{
                                                        salesmansStatistical();
                                                        x=in.nextInt();
                                                        switch(x){
                                                            case 1:
                                                                //Thống kê hóa đơn
                                                                Order.displayOrder(listOrder);
                                                                break;
                                                            case 2:
                                                                b.displayShoes();
                                                                break;
                                                        }
                                                    }while(x != 0);
                                                    x=-1;
                                                    break;
                                            }
                                        }while(x != 0);
                                    x=-1;
                                }
                                else if(role.equalsIgnoreCase("Customer") && listAccount.get(i).getRole().equalsIgnoreCase("Customer")){
                                    System.out.println("Đăng nhập thành công !!!");
                                    do{
                                        customers();
                                        x=in.nextInt();
                                        switch(x){
                                            case 1: 
                                                b.displayShoes();
                                                do{
                                                        customerBuy();
                                                        x = in.nextInt();
                                                        switch(x){
                                                            case 1: 
                                                                //Đặt hàng
                                                                Orders(listOrder, Order, b);
                                                                ThanhToan(listOrder);
                                                                break;
                                                        }
                                                    }while(x != 0);
                                                    x=-1;
                                                break;
                                            case 2: 
                                                System.out.println("Nhập id giày bạn muốn tìm: ");
                                                int m = in.nextInt();
                                                if(b.getID(m, b.shoes_list)==-1){
                                                    System.out.println("Không tồn tại giày có id: " + m);
                                                    break;}
                                                else{
                                                    System.out.println(b.shoes_list.get(b.getID(m, b.shoes_list)));
                                                    do{
                                                        customerBuy();
                                                        x = in.nextInt();
                                                        switch(x){
                                                            case 1: 
                                                                Orders(listOrder, Order, b);
                                                                ThanhToan(listOrder);
                                                                break;
                                                        }
                                                    }while(x != 0);
                                                    x=-1;
                                                }
                                                break;
                                            /*case 3: 
                                                Accountss();
                                                break;*/
                                        }
                                    }while(x != 0);
                                    x= -1;
                                }
                            }
                            }
                        kt = 1; 
                    }
                    if(kt == 0){
                        System.out.println("Không tồn tại tài khoản này!");
                    }
                break;
            case 2:
                    if(x == 2){
                    a.addAccount();                            
                    System.out.println("Đăng ký tài khoản thành công!");
                    listAccount.add(a);
                    a.getAcounts(listAccount);
                    a.updateID(listAccount);
                    }
                break;
            }
        }while(x!=0);           
    }
}