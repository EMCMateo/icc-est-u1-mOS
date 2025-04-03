package controlers;
//HACER EN LA CASA PRUEBA DE ESCRITORIO PARA COMPRNDER]!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class ShellSort {
    
    public  int [] sort(int [] array, boolean des){//Vrear un metodo sort que reciba un array de enteros, este metodo por ahora imprime la cantidad de gaps
        int n = array.length; //Crear una variable n que contenga la longitud del array
        int contCambios = 0;
        if (des){
        for (int gap = n /2; gap > 0; gap /= 2) { //Crear un bucle for que recorra el array desde la mitad hasta 0, dividiendo el gap entre 2
            System.out.println("gap: " + gap); //Imprimir el valor de gap
            System.out.println("Cambios en gap: " + gap); //Imprimir el mensaje "Cambios en gap"
            for (int i = 0; i < n; i++) { //Crear un bucle for que recorra el array desde la posicion gap hasta n
                System.out.print(array[i]+" "); //Imprimir el valor de array[j]
            }
            
        
        for (int i = gap; i<n;i++){
            int temp = array[i]; //Crear una variable temp que contenga el valor del array en la posicion i
            int j =i;

            while( j >= gap && array[j-gap] > temp){ 
                
                //Para ordenar de mayor a menor cambiar la comparacion de j-gap < temp //Crear un bucle while que recorra el array desde la posicion j hasta 0, comparando el valor de array[j] con temp
                array[j] = array[j-gap]; //Si el valor de array[j] es menor que temp, asignar el valor de array[j-gap] a array[j]
                j = j- gap; //Restar gap a j
                contCambios = contCambios+1; //Incrementar el contador de cambios
            }
            array[j] = temp; //Asignar el valor de temp a array[j]
        }
    }
        }
        else{
            for (int gap = n /2; gap > 0; gap /= 2) { //Crear un bucle for que recorra el array desde la mitad hasta 0, dividiendo el gap entre 2
                System.out.println("gap: " + gap); //Imprimir el valor de gap
                System.out.println("Cambios en gap: " + gap); //Imprimir el mensaje "Cambios en gap"
                for (int i = 0; i < n; i++) { //Crear un bucle for que recorra el array desde la posicion gap hasta n
                    System.out.print(array[i]+" "); //Imprimir el valor de array[j]
                }
                
            
            for (int i = gap; i<n;i++){
                int temp = array[i]; //Crear una variable temp que contenga el valor del array en la posicion i
                int j =i;
    
                while( j >= gap && array[j-gap] < temp){ 
                    
                    //Para ordenar de mayor a menor cambiar la comparacion de j-gap < temp //Crear un bucle while que recorra el array desde la posicion j hasta 0, comparando el valor de array[j] con temp
                    array[j] = array[j-gap]; //Si el valor de array[j] es menor que temp, asignar el valor de array[j-gap] a array[j]
                    j = j- gap; //Restar gap a j
                    contCambios = contCambios+1; //Incrementar el contador de cambios
                }
                array[j] = temp; //Asignar el valor de temp a array[j]
            }
        }
    
        System.out.println();
        System.out.println("Array ordenado: "); //Imprimir el mensaje "Array ordenado"
        imprShellSort(array); //Llamar al metodo imprShellSort para imprimir el array ordenado
        
        } 
        int [] resultado = {contCambios};
            return resultado; //Devolver el array resultado con el contador de cambios
}

    public void imprShellSort(int [] array){ //Crear un metodo imprShellSort que reciba un array de enteros
        int n = array.length; 
        for (int i = 0; i < n; i++) { 
            System.out.print(array[i] + " "); 
        }
    }
}

        /* 
        for (int i = 0; i<n; i++) { 
            gap = gap/2; //El gap por cada pasada se divide entre 2 hasta 1
            System.out.println("gap: " + gap); //Imprimir el valor de gap
            if (gap == 1){
                break; //Si gap es igual a 1, salir del bucle
            }
        }
            */
        
        

    
    
