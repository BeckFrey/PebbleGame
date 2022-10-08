import java.util.Scanner;
class Main {
    //main method header
    public static void main(String[] args) {
        int startingNumber = 0;
        int pebblesTaken = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Welcome to Pebble Game, Choose starting number >4: ");
        startingNumber = keyboard.nextInt();
        System.out.println("Starting number = " + startingNumber);

        if (determineMoveAmount(startingNumber) == 0) {
            while(pebblesTaken != 1 && pebblesTaken != 2) {
                System.out.println("How many pebbles will you grab? (1 or 2)");
                pebblesTaken = keyboard.nextInt();
                startingNumber = startingNumber - pebblesTaken;
            }
        }

        while (startingNumber > 0) {
            //display starting number
            System.out.println(startingNumber);

            //call determineMoveAmount
            startingNumber = startingNumber - determineMoveAmount(startingNumber);

            //display starting number
            System.out.println(startingNumber);

            //prompt user for int input (1 or 2)
            System.out.println("How many pebbles will you grab? (1 or 2)");

            //validate type
            while (keyboard.hasNextInt() == false) {
                String temporary = keyboard.nextLine();
                System.out.println(temporary + "is not an integer.");
                System.out.println("Enter either 1 or 2");
            }

            //assign integer to variable
            pebblesTaken = keyboard.nextInt();

            //subract int from starting number
            startingNumber = startingNumber - pebblesTaken;
        }
        System.out.println("Computer wins!");
    }
        public static int determineMoveAmount ( int num){
            return (num - 1) % 3;
        }
}
