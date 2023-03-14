package book;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException () throws InvalidPasswordException {
        // calling the constructor of parent Exception

        System.out.println("password mismatch please try again");
        Main.user();
//        super("password mismatch please try again");
//        user.login();

    }
    public void IllegalStateException() throws IllegalStateException{
        System.out.println("wrong value");

    }


}
