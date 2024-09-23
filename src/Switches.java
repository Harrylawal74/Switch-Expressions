import java.util.Scanner;

public class Switches {

        public static void main(String[] args) {

            //Prompts user to input grade
            System.out.println("What is your test percentage?");
            //Opens scanner function
            Scanner scanner = new Scanner(System.in);
            //Use of 'toLowerCase' so that any case can be used by user
            String grade = scanner.next().toLowerCase();
            //Close scanner function
            scanner.close();
            //Initiate 'message' variable with no value
            String message;
            //Each grade must be lowercase to satisfy 'toLowerCase' used previously
            //Value corresponding to grade is assigned to 'message' variable
            switch(grade){
                case "a":
                    message ="Congratulations you passed with a score of 70% +";
                    break;
                case "b":
                    message ="Congratulations you passed with a score of 60% +";
                    break;
                case "c":
                    message ="Congratulations you passed with a score of 50% +";
                    break;
                default:
                    message ="Sorry you failed the test";
                    break;


            }
            //Outputs text corresponding to grade
            System.out.println(message);

        }

}
