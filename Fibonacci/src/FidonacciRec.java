import java.util.Scanner;

public class FidonacciRec {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println("введите Количество чисел фибоначи которые хотите увидеть");
        int n = s.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.println(fib(i));
        }

    }
    static int fib (int i){
        if (i == 1) return 1;
        if (i == 2) return 1;
        return fib(i - 1) + fib(i - 2);
    }
}
