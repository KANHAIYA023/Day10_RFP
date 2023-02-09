package Com.Day10_RFP;
import java.util.Scanner;
import java.util.ArrayList;
public class UC4 {
    public static void main(String[]args){
        ArrayList<String> addressBook = new ArrayList<String>();
        addressBook.add("fName : Kanhaiya");
        addressBook.add("lName : Khairwar");
        addressBook.add("address : Dongaama");
        addressBook.add("city : Korba");
        addressBook.add("state : Chhattisgarh");
        addressBook.add("zip : 495674");
        addressBook.add("mobile no. : 6267278300");
        addressBook.add("email : kanhaiya@gmail.com");

        //delete the person name
        addressBook.remove(0);

        for (int i=0; i< addressBook.size(); i++){
            System.out.println(addressBook.get(i));
        }
    }
}
