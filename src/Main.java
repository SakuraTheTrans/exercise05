import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        AddressBook blackBook = new AddressBook();

        while(true){

            System.out.println("Would you like to add a person to the blackbook? (Y/N)");
            String userIn = input.nextLine();

            if (userIn.equalsIgnoreCase("y")){

                System.out.print("Please input a name : ");
                String name = input.nextLine();
                System.out.print("Please input a email : ");
                String email = input.nextLine();
                Person placeholder = new Person(name, email);
                blackBook.addContact(placeholder);

            } else {

                System.out.println("Your blackbook contains : " + blackBook);

                while(true){

                    System.out.println("Would you like to search for a person in the blackbook? (Y/N)");
                    userIn = input.nextLine();

                    if (userIn.equalsIgnoreCase("y")){

                        System.out.print("Persons Name : ");
                        String userLookup = input.nextLine();
                        blackBook.getContact(userLookup);

                    } else {

                        break;

                    }
                }

                break;

            }
        }
    }
}