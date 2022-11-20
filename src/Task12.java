import java.util.Scanner;

public class Task12 {

    void orientationMessage(){
        System.out.println("\033[4mЗадание 2\033[0m \nВедите возраст человека: ");
        Scanner ageScan = new Scanner(System.in);

        while(!ageScan.hasNextByte()){
            System.out.println("Введене недопустимое значение, попробуйте снова: ");
            ageScan.nextLine();
        }

        byte age = ageScan.nextByte();
        if(age >=0) {
            if (age >= 24) {
                System.out.println("человек окончил университет и ему пора искать первую работу.\n");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет.\n");
            }
            if (age >= 7 && age < 18) {
                System.out.println("Ребёнок ходит в школу.\n");
            }
            if (age < 7) {
                System.out.println("Возраст слишком мал для похода в школу.\n");
            }
        }
        else {
            System.out.println("Возраст не может быть отрицательным!\n");
        }

    }
}
