package Com.Day10_RFP;
import java.util.Scanner;
import java.util.ArrayList;
public class UC3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [][] addressBook = new String[8][2];

        System.out.println("Address Book is : ");
        addressBook[0][0] = "fName";
        addressBook[0][1] = "kanhaiya";

        addressBook[1][0] = "lName";
        addressBook[1][1] = "khairwar";

        addressBook[2][0] = "address";
        addressBook[2][1] = "Dongaama";

        addressBook[3][0] = "city";
        addressBook[3][1] = "korba";

        addressBook[4][0] = "state";
        addressBook[4][1] = "chhattisgarh";

        addressBook[5][0] = "zip";
        addressBook[5][1] = "495674";

        addressBook[6][0] = "mobile no.";
        addressBook[6][1] = "6267278300";

        addressBook[7][0] = "email.id";
        addressBook[7][1] = "kkanhaiya@gmail.com";

        //edit the name
        System.out.print("edit the name is : ");
        addressBook[0][1] = sc.nextLine();

        for (int i=0; i< addressBook.length; i++){
            for (int j=0; j<addressBook[i].length; j++) {
                System.out.print(addressBook[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
