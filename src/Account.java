import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public abstract class Account implements Comparable<Account> {

   private User user;
   private static List<Insurance> insurancelist;
   private AuthenticationStatus authenticationStatus ;

    AccountManager accountManager;


    public enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }

    public Account(User user){
        this.user=user;
    }


    @Override
    public int compareTo(Account o) {
        return this.getUser().getName().compareTo(o.getUser().getSurname());
    }


    void login(String email, String password) throws Exception {

        Scanner input = new Scanner(System.in);




        if(email.equals(this.user.getEmail()) && password.equals(this.user.getPasswords()))

    {

            System.out.println("Giriş işlemi başarılı");

        this.authenticationStatus= AuthenticationStatus.SUCCESS;

    }

        else {


            this.authenticationStatus = AuthenticationStatus.FAIL;

            throw new InvalidAuthenticationException("Giriş işlemi başarısız");

        }

}


        void addressAdds(String companyName, String district, String neighborhood, String street, int streetNo,
                            int buildingNo, String city, String postcode, String email, String phoneNumber){

            AddressManager.adress_add(this.getUser(), new BusinessAddress(companyName,district,
                    neighborhood,street,streetNo,buildingNo,city,postcode,email,phoneNumber));

        }


        void addressRemoves(int id){


            AddressManager.adress_remove(user,id);

        }


        abstract void addInsurance();






        void showuserinfo(){

            System.out.println("Hesap Bilgileri:" + "\n" +
                    "Adı: " + user.getName() + "\n" +
                    "Soyadı: " + user.getSurname() + "\n" +
                    "E-Posta: " + user.getEmail() + "\n" +
                    "Mesleği: " + user.getJob() + "\n" +
                    "Yaşı: " + user.getAge() + "\n" +
                    "Son Giriş: " + user.getLastdate());

    }

    AuthenticationStatus loginSituation(){

        return  authenticationStatus;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public static List<Insurance> getInsurancelist() {
        return insurancelist;
    }

    public void setInsurancelist(List<Insurance> insurancelist) {
        this.insurancelist = insurancelist;
    }

    public AuthenticationStatus getAuthenticationStatus() {
        return authenticationStatus;
    }

    public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
        this.authenticationStatus = authenticationStatus;
    }

    public AccountManager getAccountManager() {
        return accountManager;
    }

    public void setAccountManager(AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user);
        }

    @Override
    public int hashCode() {
            return Objects.hash(user);
    }


}
