import java.math.BigInteger;
import java.util.Scanner;

//Реализуйте метод, вычисляющий факториал заданного натурального числа.
//Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.
public class Task2_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int n = in.nextInt();
        BigInteger result = factorial(n);
        System.out.println(result);
    }

        public static BigInteger factorial(int n) {
            BigInteger ret = BigInteger.ONE; // ret=1
            for (int i = 1; i <= n; ++i) ret = ret.multiply(BigInteger.valueOf(i)); // число ret= ret*i
            //Для преобразования обычного числа в число с произвольной точностью используется статический метод valueOf()
            return ret;
        }
    }

