import java.util.Scanner;

public class Task11 {

    void congratulationMessage(){
        System.out.println("\033[4mДомашнее задание - 1\nЗадание 1\033[0m \nВедите Ваш возраст: ");
        Scanner ageScan = new Scanner(System.in);

        while(!ageScan.hasNextByte()){
            System.out.println("Введене недопустимое значение, попробуйте снова: ");
            ageScan.nextLine();
        }

        byte age = ageScan.nextByte();
        if(age >=0) {
            System.out.println("Вам " + age + " лет.");

            if (age >= 18) {
                System.out.println("Поздравляем, Вы совершеннолетний!\n");
            }
            if (age < 18){
                System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.\n");
            }
        }
        else {
            System.out.println("Возраст не может быть отрицательным!\n");
        }

    }
}
