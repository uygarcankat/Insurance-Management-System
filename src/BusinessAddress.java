public class BusinessAddress extends Address implements IAddress{


    private String CompanyName;
    private String email;
    private  String phoneNumber;


    public BusinessAddress(String companyName, String district, String neighborhood, String street, int streetNo,
                           int buildingNo, String city, String postcode, String email, String phoneNumber) {
        super();
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.CompanyName=CompanyName;
    }


    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void print (){

        System.out.println("Company :" + this.CompanyName +"district : " + this.getDistrict() +
                "neighborhood :" + this.getNeighborhood() + "Street : " + this.getStreet() + "Streetno : "+ this.getStreetNo() + " Sokak" +
                "BuildingNo :" + this.getBuildingNo() +"City :" + this.getCity() + "PostCode : " +
                this.getPostcode() + " email :"+ this.email +"phoneNumber :" + this.phoneNumber);

    }
}
