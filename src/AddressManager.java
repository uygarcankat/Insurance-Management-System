public class AddressManager {

    static User user;



    static void adress_add(User user,Address address){

        user.getAddresslist().add(address);


    }

    static void adress_remove(User user,int id){

        user.getAddresslist().remove(id);

    }

}
