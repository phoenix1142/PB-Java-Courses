package homework.lesson3;


import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте число! Введите любое число от 0 до 100.");
        System.out.println("Для выхода из программы введите - exit или quit");

        Random rand = new Random();
        int programNumber = rand.nextInt(100);

        Scanner scanner = new Scanner(System.in);
        int countOfAttempt = 0;

        while(true){

            String str = scanner.next();
            int userNumber = 0;
            try {
                userNumber = Integer.parseInt(str);
            }catch (Exception e){
                if (str.equals("exit")) {
                    System.out.println("Всего доброго!");
                    break;
                }
                if (str.equals("quit")) {
                    System.out.println("Всего доброго!");
                    break;
                }
                else {
                    System.out.println("Введите число.Если хотите выйти, для этого нажмите exit или quit");
                    continue;
                }

            }
            if (userNumber > 100 || userNumber < 0){
                System.out.println("Нужно ввести число от 0 да 100, попробуйте заново");
                continue;
            }
            countOfAttempt++;
            if (programNumber > userNumber){
                System.out.println("Введенное Вами число меньше чем загаданное, попробуйте ещё раз");
                continue;
            }
            if (programNumber < userNumber){
                System.out.println("Введенное Вами число больше чем загаданное, попробуйте ещё раз");
                continue;
            }
            if (programNumber == userNumber) {
                System.out.println("Поздравляем, Вы угадали число с " + countOfAttempt + " раза!");
                break;
            }

        }


    }
}



