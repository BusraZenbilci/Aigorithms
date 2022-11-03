/**
 ** author: Busra Zenbilci
 *    date: 07.10.22
 */

public class Main {

    public static void main(String[] args) {

        int [] Array = { 20 , 35 , -15 , 7 , 55 , 1 , -22 , };

        for (int firstIndex = 1 ; firstIndex < Array.length ;
        firstIndex++) {

            int newElement = Array[firstIndex];

            int i;

            for (i = firstIndex ; i > 0 && Array [i - 1] > newElement ;
            i--){
               Array[i] = Array[i - 1];
            }

            Array[i] = newElement;
        }

        for (int i = 0 ; i < Array.length ; i++) {
            System.out.print(Array[i] + "  ");
        }

    }
}
