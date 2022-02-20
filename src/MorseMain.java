import java.util.Scanner;

public class MorseMain {

    MorseManager mm = new MorseManager();

    public static void main(String[] args) {

        MorseMain morseMain = new MorseMain();
        morseMain.run();
    }

    public void run() {

        menu();

        int choice = getChoice();
     try {
         if (choice == 1) {
             System.out.println("Enter English Sentence: ");
             String engStr = getScanner().nextLine();
             String result = mm.englishToMorse(engStr);
             System.out.println("English: " + engStr + " Morse code: " + result);
         } else if (choice == 2) {
             System.out.println("Enter morse code, separated with :");
             String Schoice = "";
             try {
                 Schoice = getScanner().nextLine();
             } catch (Exception d) {
                 System.out.println("Morsecode only, restart");
                 System.exit(0);
             }
             String result = mm.morseToEnglish(Schoice);
             System.out.println("morse  " + Schoice + " eng : " + result);
         } else {
             System.out.println("Error: choice 1 or 2. Restart the program\n");
         }
     }catch (IllegalArgumentException e){
             System.out.println(e.getMessage());
             System.exit(0);
         }
        }

        private int getChoice () {
            int choice = 0;

            try {
                choice = getScanner().nextInt();
            } catch (Exception e) {
                System.out.println("Error");
            }
            return choice;
        }

        private void menu () {
            mm.mapMorseCode();

            System.out.println("Morse code Translator\n");
            System.out.println("----------------------\n");
            System.out.println("1.English to Morse\n");
            System.out.println("2. Morse to English\n");
        }

        private static Scanner getScanner () {
            return new Scanner(System.in);
        }
    }


