package controlers;

public class Recursividad {
    public int Ejercicio1 (int n){ //Crear un metodo Ejercicio1 que reciba un entero n
        if (n == 1){ //Caso base
            return 1; //Retornar 1 si n es igual a 1
        }else{
            return n + Ejercicio1(n-1); //Retornar n + el resultado de la llamada recursiva a Ejercicio1 con n-1
        }
        
        
    }

    public int Ejercicio2 (int base, int potencia){ //Crear un metodo Ejercicio1 que reciba un entero n
        if (potencia == 0){ //Caso base
            return 1; //Retornar 1 si n es igual a 1
        }else{
            return base * Ejercicio2(base, potencia-1 ); //Retornar n + el resultado de la llamada recursiva a Ejercicio1 con n-1
        }
        
        
    }

    public int Ejercicio3 (int num){ //Crear un metodo Ejercicio1 que reciba un entero n
        int res = 0;
        if (num<0){
            System.out.println("Dato mal ingresado");
        }else{
            if (num<10){
                res = num; //Retornar 1 si n es igual a 1
            }else{
                int ul = num%10;
                int sob = num/10;
                 res = ul + Ejercicio3(sob); //Retornar n + el resultado de la llamada recursiva a Ejercicio1 con n-1
            }
        }
        
        return res;
    }
}
