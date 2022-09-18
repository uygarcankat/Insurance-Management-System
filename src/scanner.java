import javax.security.auth.login.AccountException;
import java.util.Scanner;

public class scanner {

  User user;

  AccountManager accountManager;
  Scanner input = new Scanner(System.in);;


  void takeinfo() {

    System.out.println("Email");
    String email = input.next();
    System.out.println("passwords");
    String passwords = input.next();
    Account acc = accountManager.login(email,passwords);

    if(acc!=null){

      run(acc);
    }

  }

  void run(Account acc){
    while (true) {
      System.out.println("Yapmak istediğiniz işlemi tuşlayın");
      System.out.println("1- Kullanıcı bilgileri\n" +
              "2- yeni sigorta oluştur\n" +
              "3- Kullanıcı adresi ekle\n" +
              "4- Kullanıcı adresi sil\n" +
              "5-  çıkış yap.");
      System.out.print("Yapmak istediğiniz işlem numarasını yazın : ");
      int value = input.nextInt();

      switch (value) {
        case 1:
          acc.showuserinfo();
          break;
        case 2:
          acc.addInsurance();
          break;
        case 3:

          acc.addressAdds( input.next(), input.next(),
                   input.next(), input.next(),  input.nextInt(),
                   input.nextInt(),  input.next(),
                   input.next(), input.next(), input.next());
          break;
        case 4:

          for(Address address: user.getAddresslist()){

            System.out.println(address);
          }

          System.out.println("Kaç numaralı indexi silinmesini istersiniz");
          int chose= input.nextInt();

          acc.addressRemoves(chose);
          break;


        case 0:
          System.exit(0);
      }

    }
  }


}
