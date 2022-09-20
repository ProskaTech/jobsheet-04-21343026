/**
 * Created by Indah Chania 21343026
 * @author Indah
 */
public class KondisiOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        String status = "";
       int grade = 50;
    
       //mendapatkan status pelajar
       status = (grade >= 60) ? "passed" : "Fail";
    
       //print status 
       System.out.println(status);
    
     } 
}