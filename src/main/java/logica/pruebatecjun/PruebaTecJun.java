package logica.pruebatecjun;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaTecJun {
    //Ejercicio #1.1 Invertir paso a paso
    public void intevertirString1_1(String text){
        String[] array = text.split("");//split separa un string 
        StringBuilder newText = new StringBuilder(); //stringBuilder modifica String
        for (int i = array.length; i > 0; i--) {
            newText.append(array[i-1]);
        }
        System.out.println(newText);
    }
    //Ejercicio #1.2 Invertir con funcion
    public void intevertirString1_2(String text){
        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }
    
    
    private void numCapicua(int number){
        String numberText = String.valueOf(number);
        String reverseNumber = new StringBuilder(numberText).reverse().toString();
        
        if(numberText.equals((reverseNumber))){
            System.out.println("Is capicua");
        }else{
            System.out.println("Not capicua");
        }
    }
    
    //Ejercicio 3 Contar caracteres
    
    private void contarCaracteres(String text){
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        
        for ( i = 0; i < lenght; i++) {
            counter[text.charAt(i)]++;
        }
        for ( i = 0; i < 256; i++) {
            if (counter[i] != 0) {
                System.out.println((char)i + " : " + counter[i]);
            }
        }
    }
    
    //Ejercicio #4 Repetidos
    private void contarRepetidos(String text){
        int i, lenght, counter[] = new int[256];
        lenght = text.length();
        
        for ( i = 0; i < lenght; i++) {
            counter[text.charAt(i)]++;
        }
        for ( i = 0; i < 256; i++) {
            if (counter[i] > 1) {
                System.out.println((char)i + " : " + counter[i]);
            }
        }
    }

    //Ejercicio #5 Bisiesto
    
    private void añobisiesto(int year){
       boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }
    
    //Ejercicio #6 desordenar texto
    
    private void randomString(String text){
        String[] array = text.split("");
        List<String> List = Arrays.asList(array);//Array a List
        Collections.shuffle(List);//Organiza al azar los elementos de una lista
        List.forEach(string -> System.out.println(string));
        
    }

    //Ejercicio #7 Los elementos no duplicados
    
    private void noDuplicados(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(string -> System.out.println(string));
         
    }

    //Ejercicio #8.1 Analizar si una palabra tiene vocales
    
    private void verificarVocales8_1(String text){
        String[] array = text.split("");
        boolean aVowel = false;
        for(String s : array){
            if (s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")) {
                aVowel = true;
                break;
            }
        }
        System.out.println(aVowel);
    }
    
    //Ejercicio #8.2 Analizar si una palabra tiene vocales
    
    private void verificarVocales8_2(String text){  
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);   
    }

    //Ejercicio #8.3 Analizar si una palabra tiene vocales
    
    private void verificarVocales8_3(String text){  
        boolean rpta = Arrays.asList(text.split("")).stream().anyMatch(s -> s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u"));
        System.out.println(rpta);
    }
    //Ejercicio #9 Palindromo
    
    private boolean palabraPalindromo(String text){
        boolean result = true;
        int length = text.length();
        
        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i) != text.charAt(length -i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
        PruebaTecJun app = new PruebaTecJun();
        System.out.println("Ejercicio #1.1 Invertir paso a paso Ej Jhon");
        app.intevertirString1_1("Jhon");
        System.out.println("Ejercicio #1.2 Invertir con funcion Ej Jhon");
        app.intevertirString1_2("Jhon");
        System.out.println("Ejercicio #2 Numero capicua Ej Jhon");
        app.numCapicua(525);
        System.out.println("Ejercicio 3 Contar caracteres Ej 525");
        app.contarCaracteres("Torres");
        System.out.println("Ejercicio #4 Repetidos Ej Torres");
        app.contarRepetidos("Torres");
        System.out.println("Ejercicio #5 Bisiesto Ej 2024");
        app.añobisiesto(2024);
        System.out.println("Ejercicio #6 desordenar texto Ej Jhon Torres");      
        app.randomString("Jhon Torres");
        System.out.println("Ejercicio #7 Los elementos no duplicados Ej 1 2 3 4 5 1 2 9 11 0 5");
        app.noDuplicados(Arrays.asList(1,2,3,4,5,5,1,2,9,11,0,5));
        System.out.println("Ejercicio #8.1 Analizar si una palabra tiene vocales Ej Jhon");
        app.verificarVocales8_1("Jhon");
        System.out.println("Ejercicio #8.2 Analizar si una palabra tiene vocales Ej Jhn");
        app.verificarVocales8_2("Jhn");
        System.out.println("Ejercicio #8.3 Analizar si una palabra tiene vocales Ej Jhon");
        app.verificarVocales8_3("Jhon");
        System.out.println("Ejercicio #9 Palindromo EJ ORO");
        System.out.println(app.palabraPalindromo("ORO"));
        
    }
}




































