import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {

    public int [] getTenRolls(){
        int [] numeros= new int[10];
        Random numero =new Random();

        for (int i=0; i<10; i++){
            int valor = numero.nextInt(20)+1;
            numeros[i]=valor;
        }
        return numeros;
        
    }

    public char getRandomLetter(){
        char [] abecedario= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Random numero =new Random();
        return abecedario[numero.nextInt(25)+1];
    }

    public String generatePassword(){
        String cadena =new String();

        for (int i = 0; i < 8; i++) {
            char car = getRandomLetter();
            cadena+=car;
        }

        return cadena;
    }
    
    public String [] getNewPasswordSet(int numero){
        String [] cadenas= new String[numero];
        

        for (int j = 0; j < numero; j++) {
            String cadena =new String();
            for (int i = 0; i < 8; i++) {
                char car = getRandomLetter();
                cadena+=car;
            }
            cadenas[j]=cadena;
        }

        return cadenas;

    }

    
    
    


    
}
