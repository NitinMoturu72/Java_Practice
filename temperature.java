public class temperature {
    public static void main(String[] args) {
        System.out.println("Celsius" + "\t\t" + "Farenheit");
        for (int i = 0; i < 101; i += 5) {
            int fahrenheit = ((9*i)/5) + 32;
            System.out.println(i + "\t\t" + fahrenheit);
        }
    }
}
