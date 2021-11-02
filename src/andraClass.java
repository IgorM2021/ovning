public class andraClass {
int najmanji;
    public andraClass(int x) {

        if (najmanji < 10) {
            najmanji =x;
            // System.out.println("Numer är:");
        } else if (najmanji < 100) {
           najmanji = x;
            // System.out.println("nummer är");
        } else if (najmanji > 100) {
            najmanji = x;
            // System.out.println("Nummer är");
        }


    }
    public  int broj(){
        return najmanji;
    }
}