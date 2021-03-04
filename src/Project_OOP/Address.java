package Project_OOP;
public class Address {
    private String street;
    private String wards;
    private String district;
    private String province;
 
    public Address(){}
    public Address(String street, String village, String district, String province){
            this.street = street;
            this.wards = village;
            this.district = district;
            this.province = province;
	}
    public String getStreet(){
            return street;
	}
    public String getWards(){
            return wards;
	}
    public String getDistrict(){
            return district;
	}
    public String getProvince(){
            return province;
	}
    public void setStreet(String street){
            this.street = street;
	}
    public void setVillage(String village){
            this.wards = village;
	}
    public void setDistrict(String district){
            this.district = district;
	}
    public void setProvince(String province){
            this.province = province;
	}
    @Override
    public String toString(){
            return "Dia chi: "+getStreet() + ", " + getWards() + ", " + getDistrict() + ", " + getProvince();
	}
}
