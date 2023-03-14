package book;
import book.service.user;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    static final Scanner scanner = new Scanner(System.in);
    public static void user() throws InvalidPasswordException {
        System.out.println("LOGIN");
        var f=true;
        while(f){
            if (user.login() == 1) {
                System.out.println("login successfully");
//                main(null);
                break;
            }
            else {
                new InvalidPasswordException();
             break;
//                throw new InvalidPasswordException();

            }
        }
    }
    private static byte getChoice(boolean scannerException, byte choice) {
        do {
            try {
                scannerException = false;
                System.out.print("Enter a choice: ");
                choice = scanner.nextByte();
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("invalid input");
                /*The Scanner does not advance until the item is being read.
                This is mentioned in Scanner JavaDoc. Hence, you may just read
                the value off using .next() method or check if hasInt() before reading int value.*/
                scannerException = true;
            }
        } while (scannerException);
        return choice;
    }

    public static void main(String args[]) throws InvalidPasswordException {

        var flag = true;
        boolean scannerException = false;

        while (flag) {
            System.out.println("---------------------------For User--------------------");
            System.out.println("1) Register");
            System.out.println("2) Login");
            byte choice=0;
            choice = getChoice(scannerException, choice);

            switch (choice) {
                case 1 -> {
                    user.register();
                    flag=false;
                    System.out.println("register successfully");
                }
                case 2 -> {
                    user();
                    flag=false;
                    break;
                }
                case 3 -> {
                    System.out.println("logout");

                    System.exit(0);

                }


//                default -> {
//                    try{
//                        throw new IllegalStateException("Unexpected value: " + choice);
//
//                    }
//                    catch (Exception e)
//                    {
//                        main(null);
//                    }
////
////
//
//                }
            }






        }


//        var choice=scanner.nextByte();
//        switch(choice)
//        {
//            case(1):
//            {
//                System.out.println("register");
//                user.register();
//                System.out.println("register");
//                break;
//            }
//            case(2):
//            {
//                System.out.println("LOGIN");
//                try {
//                    if (user.login() == 1) {
//                        System.out.println("yes you are here");
//                    }
//                } catch (Exception e) {
//                    main(null);
//
//                    throw new RuntimeException(e);
//
//                }
////                else{
////                    System.out.println("id pass mismatch");
////                }
//                break;
//            }
//            case(3):
//                System.out.println("logout");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + choice);


        //user register
        //user login
        //user logout
        //book insert
        //book search
        //book delete

    }
}
