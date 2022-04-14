import java.util.Arrays;
import java.util.Scanner;

public class BusinessCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome in Business Card CREATOR. I will create business card for You!");
        System.out.print("Enter Your First Name: ");
        String name = in.next();
        System.out.print("Enter Your Last Name: ");
        String lastName = in.next();
        System.out.print("Enter Your telephone: ");
        String telephone = in.next();
        System.out.print("Enter Your e-mail: ");
        String email = in.next();
        System.out.print("Enter a border character of Your Business Card: ");
        String character = in.next();
        String fullName = name + " " + lastName;
        int width = 40;
        int height = 7;

        for (int i = 1; i <= height; i++){
            for(int j = 1; j <= width; j++){
                if(i == 1 || i == height || j == 1 || j == width){
                    System.out.print(character);
                }else if(i == 3 && j == (width - fullName.length()) /2){
                    System.out.print(fullName);
                    j += fullName.length() - 1;
                }else if(i == 4 && j == (width - telephone.length()) /2){
                    System.out.print(telephone);
                    j += telephone.length() - 1;
                }else if(i == 5 && j == (width - email.length()) /2){
                    System.out.print(email);
                    j += email.length() -1;
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
