import controlers.Recursividad;
import controlers.ShellSort;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner leer = new Scanner(System.in); //Crear un objeto Scanner para leer la entrada del usuario
        /* 
        //Ejercicio 1

         int [] array={-10,0,4,6,2,1,9,7,5}; //Crear el vector
         //int [] array={-10,0,2,1,4,6,5,7,9}; //Crear el vector

        //Instancia

        ShellSort s =  new ShellSort(); //Crear una instancia de la clase ShellSort
        s.sort(array, true); //Llamar al metodo sort con el vector a
        System.out.println("Array Descendente: ");
        int [] res = s.sort(array, true); //Llamar al metodo sort con el vector a
        
        System.out.println("--------------------------------------------------");
        s.sort(array, false); //Llamar al metodo sort con el vector a
        System.out.println("Array Ascendente: ");
        int [] res2 = s.sort(array, false); //Llamar al metodo sort con el vector a
        System.out.println("Cambios: " + res2[0]); //Imprimir el mensaje "Cambios" con el valor de cambios
        */

        System.out.println("--------------------------------------------------");
        System.out.println("Ejercicio 1: ");
        System.out.println("Ingrese el numero de elementos al cual quiere llegar: ");
        int n = leer.nextInt(); //Leer el numero de elementos
        Recursividad recu = new Recursividad(); //Crear una instancia de la clase Recursividad
        int resp1 = recu.Ejercicio1(n);
        for (int i = 1; i < n+1; i++) {
            System.out.print(i +" + ");
        } //Imprimir los numeros desde 1 hasta n
        System.out.println(" = " + resp1); //Imprimir el resultado de la suma de los numeros hasta n
        System.out.println("--------------------------------------------------");
        System.out.println("Ejercicio 2: ");
        System.out.println("Ingrese la base: ");
        int base = leer.nextInt(); //Leer la base
        System.out.println("Ingrese la potencia: ");
        int potencia = leer.nextInt(); //Leer la potencia
        Recursividad res2 = new Recursividad(); //Crear una instancia de la clase Recursividad
        int resp2 = res2.Ejercicio2(base, potencia);
        System.out.print(base + " ^ " + potencia ); //Imprimir la base y la potencia
        System.out.println(" = "+resp2); //Imprimir el resultado de la potencia
        System.out.println("--------------------------------------------------");
        System.out.println("Ejercicio 3: ");
        System.out.println("Ingrese el numero: ");
        int num = leer.nextInt(); //Leer el numero
        Recursividad recu3 = new Recursividad(); //Crear una instancia de la clase Recursividad
        int resp = recu3.Ejercicio3(num); //Llamar al metodo Ejercicio3 con el numero ingresado
        System.out.println("El resultado es: " + resp); //Imprimir el resultado de la suma de los digitos del numero
        

        
    }
}
