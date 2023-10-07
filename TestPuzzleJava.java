import java.util.ArrayList;

public class TestPuzzleJava {

    public static void main(String[] args) {

       // Make an instance of CafeUtil to access all its methods.
        PuzzleJava puzzling = new PuzzleJava();

        //methods
        ArrayList<Integer> testGetTenRolls = puzzling.getTenRolls();
        String testGetRandomLetter = puzzling.getRandomLetter();
        String testGeneratePassword = puzzling.generatePassword();
        ArrayList<String> testGetNewPasswordSet = puzzling.getNewPasswordSet(8);
        ArrayList<String> testShuffleArray = puzzling.shuffleArray();
        
        
        //show methods
        System.out.println("\n============== testGetTenRolls ================");
        System.out.println("Nombres Aleatoires compris entre 0 et 20 inclus : \n" + testGetTenRolls);
        System.out.println("\n============== testGetRandomLetter ================");
        System.out.println(testGetRandomLetter);
        System.out.println("\n============== testGeneratePassword ================");
        System.out.println(testGeneratePassword);
        System.out.println("\n============== testGetNewPasswordSet ================");
        System.out.println("Array Password :");
        System.out.println(testGetNewPasswordSet);
        System.out.println("\n============== testShuffleArray ================");
        System.out.println("Array Shuffle :");
        System.out.println(testShuffleArray);
    }
}