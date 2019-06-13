import java.util.Scanner;

public class LoopDebugging {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String userInput = "";

        while(!userInput.equals("stop")){
            System.out.println("Input a word, I will repeat it to you. Once you are ready to stop, type stop: ");
            userInput = keyboard.next();
            System.out.println(userInput);
        }
    }
}
