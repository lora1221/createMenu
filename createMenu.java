package createMenu;
import java.util.Scanner;

public class createMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu\n1. Draw the triangle\n2. Draw the square\n" +
                    "3. Draw the rectangle\n0. Exit\nEnter your choice:");
            choice = input.nextInt();
            String output = "";
            switch(choice) {
                case 1:
                    System.out.println("Draw the triangle");
                    for (int i = 0; i < 6; i ++) {
                        for (int j = 6; j > i; j --){
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.println(output);
                    break;
                case 2:
                    System.out.println("Draw the square");
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.println(output);
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    for (int i = 0; i < 3; i ++){
                        for (int j = 0; j < 6; j ++) {
                            output += "*";
                        }
                        output += "\n";
                    }
                    System.out.println(output);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }

    }
}
