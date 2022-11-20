import java.util.Scanner;

public class Task23 {

    void calculateMessage(){
        System.out.println("\033[4mЗадание 3\033[0m \nВедите количество людей в вагоне: ");
        Scanner amountScan = new Scanner(System.in);

        while(!amountScan.hasNextByte()){
            System.out.println("Введене недопустимое значение, попробуйте снова: ");
            amountScan.nextLine();
        }

        byte peopleAmount = amountScan.nextByte();
        if(peopleAmount >=0) {
            if (peopleAmount > 102) {
                System.out.println("Вагон уже полностью забит.\n");
            }
            else if(peopleAmount > 60){
                System.out.println("Некоторые пассажиры едут стоя.\n");
            }
            else {
                System.out.println("Всем пассажирам хватило сидячих мест.\n");
            }
        }
        else {
            System.out.println("Количество мест не может быть отрицательным!\n");
        }

    }
}
