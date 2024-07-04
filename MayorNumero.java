/*
 * Crea un array de 10 enteros y llena el array con los números del 1 al 10. Imprime el array.
Crea un método que tome un array de enteros y retorne la suma de sus elementos.
Escribe un programa que invierta los elementos de un array.
Crea un array bidimensional (3x3) y llénalo con números del 1 al 9. Imprime el array en forma de matriz.
Escribe un método que reciba un array de enteros y un valor entero, y retorne true si el valor está en el array, de lo contrario, retorne false.
 * 
 * 
 */



/*
public class MayorNumero {

    public static void metodoInt(int[] arrNum) {
        for (int i = 0; i < arrNum.length; i++) {
            System.out.println("elemento"+i+ ":" + arrNum[i]);
        }
    };

    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        metodoInt(array);
        
    }
}
*/


/* public class MayorNumero {
    public static void sumNumeros(int[] arr){
        int suma = 0;
        for(int i = 0; i < arr.length; i++) {
            suma += arr[i];
        }

        System.out.println("la suma del array es: "+suma);
    }

    public static void main(String[] args) {
        int[] arrayNumeros={1,2,3,4,5};
        sumNumeros(arrayNumeros);
        
    }
} */


/* public class MayorNumero {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8};
        int n = num.length;
        for(int i = 0; i < num.length / 2; i++){
            int temp = num[i];
            num[i] = num[n - 1 - i];
            num[n - 1 - i] = temp;
        }
        for (int nuum : num) {
            System.out.println(nuum);
        }
    }
} */


/* public class MayorNumero {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int numero = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++){
                arr[i][j] = numero ;
                ++numero;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
} */


public class MayorNumero {

    public static boolean metodo(int[] arr, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == num) {
                return true;
            }
        }
        return false;
    };
    public static void main(String[] args) {
        int[] arry = {1,2,3,4,5};
        int numero = 32;
        boolean resultado = metodo(arry, numero);

        System.out.println(resultado);
    }
}