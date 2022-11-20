import java.util.Scanner;

public class Task31 {

    void orientationMessage(){
        System.out.println("\033[4mДомашнее задание - 3\nЗадание 1\033[0m \nВедите возраст человека: ");
        Scanner ageScan = new Scanner(System.in);

        while(!ageScan.hasNextByte()){
            System.out.println("Введене недопустимое значение, попробуйте снова: ");
            ageScan.nextLine();
        }

        byte age = ageScan.nextByte();
        if(age >=0) {
            System.out.println("Человеку " + age + " лет.");

            if (age >= 24) {
                System.out.println("Ему пора ходить на работу.\n");
            }
            else if(age > 18){
                System.out.println("Его место в университете.");
            }
            else if(age >= 7){
                System.out.println("Ему нужно ходить в школу.");
            }
            else if(age >= 2){
                System.out.println("Ему нужно ходить в детский сад.");
            }
            else {
                System.out.println("Возраст слишком мал.\n");
            }
        }
        else {
            System.out.println("Возраст не может быть отрицательным!\n");
        }

    }
}
