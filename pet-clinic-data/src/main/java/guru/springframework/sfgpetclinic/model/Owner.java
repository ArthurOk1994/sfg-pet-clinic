package guru.springframework.sfgpetclinic.model;

public class Owner extends Person {

    public Owner() {
    }

    public Owner(String lastName) {
        super.setLastName(lastName);
    }
}
