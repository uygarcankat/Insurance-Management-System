public class HomeAddress extends Address implements IAddress{



    public HomeAddress(String buildingName, String district, String neighborhood,
                       String street, int streetNo, int buildingNo, String city, String postcode) {

        super();
    }




    @Override
    public void print(){

        System.out.println("buildingName : " + this.getBuildingName() + "district : " + this.getDistrict() + "neighborhood : "
                + this.getNeighborhood() + "Street : " + this.getStreet() + " Sokak" + "BuildingNo :" + this.getBuildingNo() +
                " Nolu Bina" +"City : " + this.getCity() + "Postcode : " + this.getPostcode());
    }


}
