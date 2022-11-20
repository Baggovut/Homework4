import java.util.InputMismatchException;
import java.util.Scanner;

public class Task33 {

    void comparisonMessage(){
        System.out.println("\033[4mЗадание 3\033[0m \nВедите три числа для сравнения: ");
        Scanner numberScan = new Scanner(System.in);

        try {
            int one = numberScan.nextInt();
            int two = numberScan.nextInt();
            int three = numberScan.nextInt();
            System.out.println("One: " + one + ", Two: " + two + ", Three: " + three);
            if(one == two && one == three){
                System.out.println("Все три числа равны");
            }
            else if(one > two && one > three){
                System.out.println("Большее значение у One");
            }
            else if(two > one && two > three){
                System.out.println("Большее значение у Two");
            }
            else if(three > one && three > two){
                System.out.println("Большее значение у Three");
            }
            else if(one == two && one > three){
                System.out.println("Значения у One и Two равны, и они больше значения у Three");
            }
            else if(one == three && one > two){
                System.out.println("Значения у One и Three равны, и они больше значения у Two");
            }
            else if(two == three && two > one){
                System.out.println("Значения у Two и Three равны, и они больше значения у One");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введене недопустимое значение.");
        }

        numberScan.close();
    }
}
