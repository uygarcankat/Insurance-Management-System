import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private String email;
    private String passwords;
    private String job;
    private int age;
    private Date lastdate;
    private ArrayList<Address> addresslist;


    public User(String name, String surname, String email, String passwords, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.passwords = passwords;
        this.job = job;
        this.age = age;
        this.addresslist = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getLastdate() {
        return lastdate;
    }

    public void setLastdate(Date lastdate) {
        this.lastdate = lastdate;
    }

    public ArrayList<Address> getAddresslist() {
        return addresslist;
    }

    public void setAddresslist(ArrayList<Address> addresslist) {
        this.addresslist = addresslist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(email, user.email);
    }
    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
}
