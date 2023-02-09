package Com.Day10_RFP;
import java.util.ArrayList;
import java.util.Collections;
public class UC5 {
    public static void main(String[] args) {
        ArrayList<String> addressBook = new ArrayList<String>();
        addressBook.add("fName : Kanhaiya");
        addressBook.add("lName : khairwar");
        addressBook.add("fName : Arjun");
        addressBook.add("lname : khairwar");
        addressBook.add("fName : Baldev");
        addressBook.add("lName : prasad");

        for (int i=0; i<addressBook.size(); i++){
            System.out.println(addressBook.get(i));
        }
    }
}
