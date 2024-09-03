
import java.util.Scanner;
public class strings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        while (!line.equals("END"))
        {
            String first = line.substring(0, 10);
            String last = line.substring(12, 22);
            String state = line.substring(10, 12);
            String zip = line.substring(22, 27);
            String city = line.substring(27, 37);
            String address = line.substring(37);

            first = first.replace('*', ' ').trim();
            last = last.replace('*', ' ').trim();
            state = state.toUpperCase();

            city = city.replace('*', ' ').trim();
            address = address.replace('*', ' ').trim();

            if(last.lastIndexOf("witz") == -1){
                System.out.println(last + " " + first);
                System.out.println(address);
                System.out.println(city + ", " + state + ", " + zip);

            }
            
            line = in.nextLine();
        }

    }
}
