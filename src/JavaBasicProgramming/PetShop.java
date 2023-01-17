package JavaBasicProgramming;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogsFood = Integer.parseInt(scanner.nextLine());
        int catsFood = Integer.parseInt(scanner.nextLine());
        double result = dogsFood * 2.50 + catsFood * 4;

        System.out.println(result + " lv.");

    }
}
