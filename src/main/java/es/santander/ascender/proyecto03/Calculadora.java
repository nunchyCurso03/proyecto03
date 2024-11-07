package es.santander.ascender.proyecto03;

public class Calculadora {

    public long sumar (long sumando1, long sumando2){
        return sumando1 + sumando2;

    }
    
    public long restar (long substraendo, long minuendo){
        return substraendo - minuendo;

    }

    public long multiplicar (long factor1, long factor2){
        return factor1 * factor2;
    }

    public double dividir (long dividendo, long divisor){
        return dividendo / divisor;

    }

    public void presentarTablaMultiplicar(int numero){

        for (int i = 0;i <= 10;i = i + 1){
            System.out.println(numero*i);

        }
    }

    public void jugarConArrays(int numero){

        int[]resultados = null;
        int[] borrame =new int[11];
        borrame[0] = 3;
        borrame[4] = 6;
        borrame[7] = borrame[0] + borrame[4];
        System.out.println(borrame[7]);
    }


    public int[] calcularTablaMultiplicar(int numero){ 

        int[] tablaDeMultiplicar = new int [11];
        for(int i = 0; i<=10; i++){
            tablaDeMultiplicar[i] = i * numero;
        }
        return tablaDeMultiplicar;
    }

    public int[] calcularTablaMultiplicarConWhile(int numero){ 
        //creo el array
        int[] tablaDeMultiplicar = new int [11];
        //int[] tablaDeMultiplicar = new int [] {0,0,0,0,0,0,0,0,0,0};

        int i = 0;
        while ( i <= tablaDeMultiplicar.length - 1){ 
            tablaDeMultiplicar[i] = numero * i;
            i++;
        }

        //Retorno el array con la tabla de multiplicar
        return tablaDeMultiplicar;

       
    }

    public int[] calcularTablaMultiplicarConDoWhile(int numero){ 
        //creo el array
        int[] tablaDeMultiplicar = new int [11];
        //int[] tablaDeMultiplicar = new int [] {0,0,0,0,0,0,0,0,0,0};

        int i = 0;
        do { 
            tablaDeMultiplicar[i] = numero * i;
            i++;
        }while ( i <= tablaDeMultiplicar.length - 1);

        //Retorno el array con la tabla de multiplicar
        return tablaDeMultiplicar;

       
    }
}
 