package backend2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DBWorker dbWorker = new DBWorker();
        Scanner sc = new Scanner(System.in);

        //Блок работы регистрации
        System.out.println("Введите логин:  *");
        String login = sc.nextLine();
        System.out.println("Введите пароль:  *");
        int pass = sc.nextInt();
        sc.nextLine();
        System.out.println("Введите свою почту:  *");
        String email = sc.nextLine();
        dbWorker.register(login, email, pass);

        //Блок авторизации
        System.out.println("Начнем авторизацию?");
        int go = sc.nextInt();
        dbWorker.authorize(login, pass);



    }
}
