package games;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        try {
            demo.testException();
        }catch (RPSException rpsException){
            System.out.println("Fel input");
        }
    }

    public void testException() throws RPSException{
        Scanner scanner = new Scanner(System.in);
        String test = "";
        test = scanner.nextLine();

        if(!test.equals("rock")){
            throw new RPSException();
        }

    }

}
