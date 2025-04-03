import controlers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
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

        

        
    }
}
