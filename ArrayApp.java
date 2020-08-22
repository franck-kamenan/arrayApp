package be.intecbrussel.hoofdstuk7.arrayApp;

import java.util.Arrays;

public class ArrayApp
{
    public static void main(String[] args)
    {
        int[] monArray = new int[10];
        int[] nombres = {1, 3, 6};
        int[] numeros;
        numeros = new int[]{8, 4};
        int[] numbers = nombres;
        System.out.println(Arrays.toString(monArray));
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numbers));
        numbers[2] = 9;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
        for (int i: numbers)
        {
            System.out.println(i);
        }

        String[] lignes = new String[5];
        lignes[0] = "World";
        lignes[1] = "Warudo";
        lignes[2] = "Earth";
        lignes[3] = "Moon";
        lignes[4] = "Mars";
        System.out.println(Arrays.toString(lignes));


        String joJO = "This is a bizarre adventure.";
        String[] mots = joJO.split(" ");
        for (String i: mots)
        {
            System.out.println(i);
        }
        /*for (String i: args) //public static void main(String[] args)
        {
            System.out.println(i);
        }*/

    }
}
