import java.util.Scanner;
public class SevenSegmentDisplay {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number you want to display: ");

            int userInput = input.nextInt();

            switch(userInput){

                case 0:
                    System.out.println(" _ \n| | \n|_|");
                    break;
                case 1:
                    System.out.println("   \n  |\n  |");
                    break;
                case 2:
                    System.out.println(" _ \n |\n| ");
                    break;
                case 3:
                    System.out.println(" _ \n _|\n _|");
                    break;

                case 4:
                    System.out.println("   \n|_|\n  |");
                    break;
                case 5:
                    System.out.println(" _ \n|_ \n _|");
                    break;
                case 6:
                    System.out.println(" _ \n|_ \n|_|");
                    break;
                case 7:
                    System.out.println(" _ \n  |\n  |");
                    break;
                case 8:
                    System.out.println(" _ \n||\n||");
                    break;
                case 9:
                    System.out.println(" _ \n|_|\n _|");
                    break;
            }
        }
    }

