import java.util.Scanner; 
public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the dataset");
        int n = in.nextInt();
        int[] array = new int[n];
        System.err.println("Enter the numbers: ");
        for(int i=0; i<n; i++){
            array[i] = in.nextInt();
        }
        float avg = 0;
        int sum = 0;
        int min = array[0];
        int max = array[0];
        for(int i=0; i<n; i++){
            sum += array[i];
            if(array[i]>max){
                max = array[i];
            }
            if(array[i]<min){
                min = array[i];
            }
        }
        avg = sum/n;
        System.out.printf("Average is %.2f, Min is %d, Max is %d", avg, min, max);
    }
}
