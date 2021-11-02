import java.util.Scanner;

public class övning30 {
    public static void main(String[] args) {
        //30.Läs in ett tal. Skriv ut om talet är mindre än 10, mindre än 100 eller större än 100.

        Scanner scan = new Scanner(System.in);

int x;
//int x2;


        System.out.println("Skriva tal:");
      x = scan.nextInt();


        andraClass najmanji= new andraClass(x);


   System.out.println("nummer är  mindre av 10: " +najmanji.broj());
        System.out.println("nummer är  mindre av 100: " + najmanji.broj());
        System.out.println("nummer är  store av 100: " + najmanji.broj());

    }


}
