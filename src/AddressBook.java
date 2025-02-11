import java.util.ArrayList;

public class AddressBook {
    static ArrayList<Person> contactList = new ArrayList<>();

    public AddressBook() {
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "contactList=" + contactList +
                '}';
    }

    // Methods

    void getContact (String a) {
        for (Person person : contactList) {
            if (a.equals(person.getName())) {
                System.out.println(person.getEmail());
            }
        }
    }

    void addContact (Person a) {
        contactList.add(a);
    }

}
