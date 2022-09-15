/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int a = 10;
         int b = 23;
         int c = 5;
         int tertinggi;
         
         tertinggi = (b > a) ? (b > c) ? b : a : c;
         System.out.println("number 1 = 10");
         System.out.println("number 2 = 23");
         System.out.println("number 3 = 5 ");
         System.out.println("Nilai tertingginya adalah angka = " +tertinggi);
    }
}
