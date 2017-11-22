import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначи которые хотите увидеть");
        int n = in.nextInt();
        int a = 1;
        int b = 1;
        int sum;
        for(int i = 0; i < n; i++){
            if (i == 0 || i ==1){
                System.out.println("1");
            } else{
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            }
        }

    }
}
