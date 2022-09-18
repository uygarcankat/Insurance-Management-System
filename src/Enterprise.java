import java.util.ArrayList;
import java.util.Scanner;

public class Enterprise extends Account {

    Scanner input=new Scanner(System.in);

    AccountManager accountManager;

    public Enterprise(User user) {
        super(user);

    }

    @Override
    void addInsurance(){


        System.out.println("Sigorta Türlerimiz");
        System.out.println("1- Sağlık Sigortası\n" +
                "2- Konut Sigortası\n" +
                "3- Seyahat Sigortası\n" +
                "4- Araba Sigortası");
        System.out.print("Yapmak istediğiniz sigorta çeşidinin numarasını giriniz : ");
        switch (input.nextInt()){
            case 1:

                Account.getInsurancelist().add(new HealthInsurance("Enterprise"));
                System.out.println("Sigorta onaylandı.");
                break;
            case 2:
                Account.getInsurancelist().add(new ResidenceInsurance("Enterprise"));
                System.out.println("Sigorta onaylandı.");
                break;
            case 3:
                Account.getInsurancelist().add(new TravelInsurance("Enterprise"));
                System.out.println("Sigorta onaylandı.");
                break;
            case 4:
                Account.getInsurancelist().add(new CarInsurance("Enterprise"));
                System.out.println("Sigorta onaylandı.");
                break;
            default:
                System.out.println("Geçersiz veri girişi!");
                break;
        }


    }
}
