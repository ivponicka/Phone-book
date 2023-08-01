import java.util.Scanner;

public class Main{

    static Phonebook phonebook = new Phonebook();
    public static void main(String[] args) {

    Contact[] contacts = new Contact[] {
            new Contact("James Smith", "1111111111"),
            new Contact("Carl Peterson", "22222222222"),
            new Contact("Sophie Rodger", "33333333333"),
        };

        for (Contact contact : contacts) {
            phonebook.addEntry(contact);
        }

        Scanner input = new Scanner(System.in);
        System.out.println("----------PHONE BOOK---------");
        System.out.println("1. Open the book");
        System.out.println("2. Close the book");
        System.out.println("What do you want to do? Choose 1 or 2: ");
        int choice = input.nextInt();

        while(choice==1){
        System.out.println("What do you want to do: ");
        System.out.println("1. Add new contact.");
        System.out.println("2. See all contacts.");
        System.out.println("3. Edit.");
        System.out.println("4. Delete.");
        System.out.println("5. Exit.");
        int answer = input.nextInt();
           switch(answer) {
                case 1:
                    input.nextLine();
                    System.out.print("Type name: ");
                    String nameAdd = input.nextLine();
                    System.out.print("Type phone number: ");
                    String phoneAdd = input.nextLine();
                    Contact contactAdd = new Contact(nameAdd, phoneAdd);
                    phonebook.addEntry(contactAdd);
                    System.out.println("-----Added a new contact into-----");
                    System.out.println("----->Click to continue...");
                    input.nextLine();
                    break;
                case 2:
                    System.out.println("All contacts in your phone book: ");
                    System.out.println(phonebook);
                    System.out.println("-----");
                    break;
                case 3:
                    System.out.println("Type index of the entry: ");
                    int idxEdit = input.nextInt();
                    Contact contactEdit = phonebook.getEntry(idxEdit);
                    input.nextLine();
                    System.out.println("Set a new phone number for " + contactEdit.getName() + ": ");
                    String updatedNumber = input.nextLine();
                    contactEdit.setNumber(updatedNumber);
                    phonebook.setEntry(idxEdit, contactEdit);
                    System.out.println("-----Updated the contact into-----");
                    System.out.println("----->Click to continue...");
                    input.nextLine();
                    break;
                case 4:
                    System.out.println("Type index of the entry to delete it: ");
                    int idxDelete = input.nextInt();
                    input.nextLine();
                    phonebook.deleteEntry(idxDelete);
                    System.out.println("-----Deleted the contact into-----");
                    System.out.println("----->Click to continue...");
                    input.nextLine();
                    break;
                 case 5:
                    System.exit(0);
                    break;
                 }
                    
           } 
             input.close(); 
        }

   
 }