package sample;

/**
 * Created by amalabukar on 12/1/16.
 */

public class Contact {
    String name;
    String email;
    String number;

    public Contact(String name, String email, String number) {
        this.name = name;
        this.email = email;
        this.number = number;

    }

    @Override
    public String toString() {
        return name + "  " + number + " " + email;
    }
}



