import java.util.Set;
import java.util.TreeSet;

public class AccountManager {

    Account account;

    TreeSet<Account> Accountlist ;


    public AccountManager() {

        Accountlist= new TreeSet<>();

    }

    Account login(String email, String password) {

        Account account2 = null;

        for (Account account : Accountlist) {
            if (account.getUser().getEmail().equals(email) && account.getUser().getPasswords().equals(password)) {

                account2 = account;
                break;

            }

        }

        try {
            account2.login(email,password);
        }
        catch (InvalidAuthenticationException e) {
            System.out.println(e.getMessage());

        }catch (Exception e){
            System.out.println("Böyle bir kullanıcı bulunmamaktadır!");

        }
        return account2;
    }
}