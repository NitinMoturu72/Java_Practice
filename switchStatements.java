import java.util.Scanner;
public class switchStatements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int comma = 0;
        int dollar = 0;
        int carriage = 0;

        while(ch != '#'){
            switch(ch) {
                case ',' : 
                    comma += 1;
                    break;
                case '$':
                    dollar += 1;
                    break;
                case '\n':
                    carriage += 1;
                    break;
            }
            ch = in.next().charAt(0);
        }

        System.out.printf("Number of Commas: %d \nNumber of Dollar Signs: %d \nNumber of Carriage: %d", comma, dollar, carriage);
    }
}
