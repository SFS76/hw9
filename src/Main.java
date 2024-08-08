import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
     public static void main(String[] args) {
         //task 1
         int[] payments = {10_000, 20_000, 30_000, 40_000, 50_000};
         int paymentSum = 0;
         for (int element : payments) {
            paymentSum = paymentSum + element;
         }
         System.out.println("Сумма трат за месяц составила " + paymentSum + " рублей");
         //task 2
         int[] payments1 = {30_000, 20_000, 10_000, 50_000, 40_000};
         int paymentMax = payments1 [0];
         int paymentMin = payments1 [0];
            for (int element : payments1) {
                if (element < paymentMin) {
                    paymentMin = element;
                }
                if (element > paymentMax) {
                    paymentMax = element;
                }
            }
         System.out.println("Минимальная сумма трат за неделю составила " + paymentMin + " рублей");
         System.out.println("Максимальная сумма трат за неделю составила " + paymentMax + " рублей");
         //task 3
         int[] payments2 = {10_000, 20_000, 30_000, 40_000, 50_000};
         int paymentSum2 = 0;
             for (int element : payments) {
             paymentSum2 = paymentSum2 + element;
         }
         float paymentAvg = paymentSum2/payments2.length;
         System.out.println("Средняя сумма трат за месяц составила " + paymentAvg + " рублей");
         //task 4
         char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
         String stringRevers = new String(reverseFullName);
         for (int i = 0; i < reverseFullName.length; i++ ) {
             reverseFullName [i] = stringRevers.charAt(reverseFullName.length - i - 1);
         }
         System.out.println(Arrays.toString(reverseFullName));
     }
}