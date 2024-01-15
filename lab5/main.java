package lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat firstCat = new Cat("Tom","orange",3);
        Cat secondCat = new Cat("Aurel","blue",5);

        firstCat.play();
        firstCat.feed();
        firstCat.sleep();
        firstCat.miau();

        firstCat.getAge();
        firstCat.getName();
        firstCat.getColor();

        Employee employee1 = new Employee("Andrei", "Andrei@gmail.com",15, 8, 4);
        employee1.calculateMonthlyIncome();

        System.out.println("Introduceti numele angajatului: ");
        String nume = scanner.nextLine();
        System.out.println("Introduceti adresa de email: ");
        String email = scanner.nextLine();
        System.out.println("Introduceti cat castiga pe ora: ");
        Integer hourRate = scanner.nextInt();
        System.out.println("Introduceti cat lucreaza pe zi: ");
        Integer capacitate = scanner.nextInt();
        System.out.println("introduceti cate zile libere va avea: ");
        Integer freeDays = scanner.nextInt();

        Employee employee2 = new Employee( nume, email, hourRate,capacitate, freeDays );
        employee2.calculateMonthlyIncome();



    }
}
