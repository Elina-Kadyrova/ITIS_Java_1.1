package entities;

public class Admin extends Worker{

    public Admin(String name, String surname, int age, boolean gender, String address,
                 int seniority, double salary) {
        super(name, surname, age, gender, address, seniority, salary);
    }

    public void toBlacklist(Reader reader){
        reader.status = true;
    }
}
