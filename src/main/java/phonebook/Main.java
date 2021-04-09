package phonebook;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Contacts contacts = new Contacts();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Welcome to phonebook, what would you like to do?");
            System.out.println("To add new name,type add and number" );
            System.out.println("To view all contacts, type load and Phonebook");
            System.out.println("To delete contact, type delete and name");
            System.out.println("To save the contact,type save and Phonebook");
            System.out.println("To check the status, tape status");
            System.out.println("Please make your selection");
            String command = scanner.next();

            if(command.equals("add")){
                String name = scanner.next();
                String number = scanner.next();
                contacts.add(name, number);
            }
            else if(command.equals("find")){
                String name = scanner.next();
                contacts.find(name);
            }
            else if(command.equals("status")){
                contacts.status();
            }
            else if(command.equals("delete")){
                String name = scanner.next();
                contacts.delete_entry(name);
            }
            else if(command.equals("load")){
                String fileName = scanner.next();
                contacts.loadFile(fileName);
            }
            else if(command.equals("save")){
                String fileName = scanner.next();
                contacts.saveFile(fileName);
            }
            else if(command.equals("exit")){
                break;
            }
        }
        scanner.close();
    }

    private static void PhoneBook() {

    }

}


