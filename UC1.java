package Com.Day10_RFP;
import java.util.Scanner;
public class UC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String [][] addressBook = new String[2][8];

        System.out.println("Address Book :");
       addressBook[0][0] = "first name";
       addressBook[0][1] = "last name";
       addressBook[0][2] = "address";
       addressBook[0][3] = "city";
       addressBook[0][4] = "state";
       addressBook[0][5] = "zip";
       addressBook[0][6] = "mobile number";
       addressBook[0][7] = "email id";

       addressBook[1][0] = "kanhaiya";
       addressBook[1][1] = "khairwar";
       addressBook[1][2] = "Dongaama";
       addressBook[1][3] = "Korba";
       addressBook[1][4] = "Chhattisgarh";
       addressBook[1][5] = "595674";
       addressBook[1][6] = "6267278300";
       addressBook[1][7] = "cpkkanhaiya@gmail.com";

       for (int i=0; i<addressBook.length; i++){
          for (int j=0; j<addressBook[i].length; j++){
             System.out.print(addressBook[i][j]   +   "       ");
          }
          System.out.println();
       }

    }
}
