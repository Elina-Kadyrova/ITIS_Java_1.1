import entities.Artist;
import entities.Dancer;
import entities.PublicPerson;
import entities.Singer;

public class Main {
    public static void main(String[] args) {
        PublicPerson [] array = new PublicPerson[3];
        PublicPerson person = new Dancer("Name", 32, 1, "Stagename", false,
                3, 32, 1, 4);//upcasting
        array[0] = new Artist("N", 45, 2, "Stname", false, 4,
                1, 0, 0);
        array[1] = new Dancer("Na", 12, 3, "Stagename", true,
                24, 32, 5, 8);
        array[2] = new Singer("Nam", 23, 3, "Stagename", true,
                24, 67, 2, 8);
        array[0].toCreateSomethingNew();
        array[1].toCreateSomethingNew();
        array[2].toCreateSomethingNew();
    }
}
