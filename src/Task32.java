import java.util.Scanner;

public class Task32 {

    void restrictionMessage(){
        System.out.println("\033[4mЗадание 2\033[0m \nВедите возраст ребёнка: ");
        Scanner ageScan = new Scanner(System.in);

        while(!ageScan.hasNextByte()){
            System.out.println("Введене недопустимое значение, попробуйте снова: ");
            ageScan.nextLine();
        }

        byte age = ageScan.nextByte();
        if(age >=0) {
            System.out.println("Ребёнку " + age + " лет.");

            if(age < 5){
                System.out.println("Ребёнок не может кататься на аттракционе.\n");
            }
            else if(age < 14){
                System.out.println("Ребёнок может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.\n");
            }
            else{
                System.out.println("Ребёнок может кататься без сопровождения взрослого.\n");
            }
        }
        else {
            System.out.println("Возраст не может быть отрицательным!\n");
        }

    }
}
