
package Table;
import java.util.ArrayList;
public class Table {
    static int i=0;
    private int id;
    private String Ten_ban;
    private boolean Trang_thai;
    
    public Table(){};
    public Table(int id, String Ten_ban){
        this.id=id;
        this.Ten_ban =Ten_ban;
        this.Trang_thai= false;
       
    }
    public void setStatus(boolean Trang_thai){
        this.Trang_thai=Trang_thai;
    }
    public boolean getStatus(){
       return this.Trang_thai;
    }
    public String getTrangThai(){
        if(this.Trang_thai== true)
            return "Hiện đang sử dụng";
        else
            return "Hiện đang rảnh";
    }
    public void checkTrangThai(){
        for(i=0;i<table.size();i++){
            System.out.println(this.table.get(i).getTenBan()+" \t\t---- \t\t"+ this.table.get(i).getTrangThai());
        }
    }
    public void setID(int id){
        this.id=id;
    }
    public void setTenBan(String Ten_ban){
        this.Ten_ban=Ten_ban;
    }
   
    public int getID(){
        return this.id;
    }
    public String getTenBan(){
        return this.Ten_ban;
    }
   
    
    public ArrayList<Table> table = new ArrayList<Table>();
    public void tao_ban (){
        for(int j=0;j<10;j++){
            Table table = new Table(i+1,"Bàn "+(i+1));
            this.table.add(i, table);            
             i++;           

        }
    }
    public void xuat_ban(){
        
        System.out.print(table);
    }
     public void cap_nhat_ban(){
       Table ban = new Table(i+1,"Bàn "+(i+1));
        table.add(i,ban);
        i++;  
    }
     public String toString(){
         return this.Ten_ban;
     }
}
