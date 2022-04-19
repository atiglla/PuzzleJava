import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava generador = new PuzzleJava();
        int [] aleatorio = generador.getTenRolls();

        System.out.println(Arrays.toString(aleatorio));
        System.out.println(generador.getRandomLetter());
        System.out.println(generador.generatePassword());
        String x [] =(generador.getNewPasswordSet(7));
        System.out.println(Arrays.toString(x));

        System.out.println(Arrays.toString(generador.shuffleArray(x)));
    
    }
}