import java.util.ArrayList;
// You will need to import the Random library from java.util
import java.util.Random;

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> ArrayNumber = new ArrayList<Integer>();

        Random randNumber = new Random();

        for (int i = 0; i < 10; i++) {
            ArrayNumber.add(randNumber.nextInt(20) + 1);  // entier aléatoire compris entre 1 et 20 inclus.
        }

        return ArrayNumber;
    }



    public String getRandomLetter() {
        String[] arrayLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        Random randLetter = new Random();
        int randIndex = randLetter.nextInt(26); // compris entre 0 et 25
        return "Letter Number " + randIndex + " : " + arrayLetters[randIndex].toUpperCase();
    }



    public String generatePassword() {
        String[] arrayLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        Random randLetter = new Random();

        String password = "";
        for (int i = 0; i < 8; i++) {
            int randIndex = randLetter.nextInt(26); // compris entre 0 et 25
            password += arrayLetters[randIndex];
        }
        return "Password is : " + password;
    }



    public ArrayList<String> getNewPasswordSet(int lengthArray) {
        String[] arrayPassword = new String[lengthArray];

        ArrayList<String> NewArrayPassword = new ArrayList<String>();

        String[] arrayLetters = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
                "r", "s", "t", "u", "v", "w", "x", "y", "z" };
        Random randLetter = new Random();

        for (int j = 0; j < lengthArray; j++) {

            String password = "";
            for (int i = 0; i < 8; i++) {
                int randIndex = randLetter.nextInt(26); // compris entre 0 et 25
                password += arrayLetters[randIndex];
            }
            arrayPassword[j] = password; // A chaq nouveau tour de boucle un nveau password

        }

        for (String elt : arrayPassword) {
            NewArrayPassword.add(elt);
        }

        return NewArrayPassword;
    }



    //SENSEI BONUS:
    public ArrayList<String> shuffleArray () {

        ArrayList<String> NewArrayRand = new ArrayList<String>();

        String[] arrayRand = {"1", "2", "3"};

       
        Random randWords = new Random();

        for (int i = 0; i < arrayRand.length; i++) {

           String temp = arrayRand[i];

           int randIndex = randWords.nextInt(arrayRand.length); // compris entre 0 et le length du tableau exclus
           
           arrayRand[i] = arrayRand[randIndex];
           arrayRand[randIndex] = temp;
        }

        for (String elt : arrayRand) {
            NewArrayRand.add(elt);
        }

        return NewArrayRand;
    }

}