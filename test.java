import javax.swing.* ;
import java.util.ArrayList;


class PersonInfo {
    String name;
    String address;
    String phoneNumber;
     
    // Pareameterized constructor
    PersonInfo(String n, String a, String p){
        name = n;
        address = a;
        phoneNumber = p;
    }
    // display on GUI
    void display() {
        JOptionPane.showMessageDialog(null, "Name: " + name + "Address: "+ address + "Phone no: " + phoneNumber);
    }
}
class AddressBook {
    ArrayList persons;

    //constructor
    AddressBook() {
        persons = new ArrayList();
    }

    // adding a Person Object
    void addPerson() {
        String name = JOptionPane.showInputDialog("Enter name:");
        String add = JOptionPane.showInputDialog("Enter address:");
        String pNum = JOptionPane.showInputDialog("Enter phoneNo.");
           // creating a personInfo Object
        PersonInfo p = new PersonInfo(name, add, pNum); 
        persons.add(p);
    }

    // Searching for a person
    void searchPerson(String n){
    for (int i=0; i<persons.size(); i++){
        PersonInfo p = (PersonInfo) persons.get(i);
        if(n.equals(p.name)){
            p.display();
        }
}
}

    // Deleting a person
   void deletePerson(String n){
    for(int i = 0; i<persons.size(); i++){
      PersonInfo p = (PersonInfo) persons.get(i);
        if(n.equals(p.name)){
            persons.remove(i);  
    }
}
   }
}

public class test {
     public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        String input, s;
        int ch;
        
        while (true){
            input = JOptionPane.showInputDialog("Enter 1 to Add\nEnter 2 to Search\nEnter 3 to Delete\nEnter 4 to Exit");
            ch = Integer.parseInt(input);

            switch (ch){
                case 1:
                   ab.addPerson();
                   break;
                case 2:
                   s = JOptionPane.showInputDialog("Enter Name to search");
                   ab.searchPerson(s);
                   break;
                case 3:
                   s = JOptionPane.showInputDialog("Enter Name to delete");
                   ab.deletePerson(s);
                   break;
                case 4:
                   System.exit(0);

            }
        }
    }

}