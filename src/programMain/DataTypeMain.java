package programMain;

public class DataTypeMain {

    public static void main(String[] args) {
        //Tipos de datos en Java
        //Declaración de los diferentes tipos de datos en Java
        byte Byte = 1;
        short numeroShort = 100, numeroShort2 = 321;
        int numeroEntero = 1001001, numeroEntero2 = 100;
        long numeroLong = 1001001001, numeroLong2 = 32412;
        float numeroFloat = (float) 150.1, numeroFloat2 = (float) 1000.1;
        double numeroDouble = 150051.51, numeroDouble2 = 10230321.82;
        char character = 'a';
        boolean booleano = false;
        String string = "Esto es una cadena STRING ";
        
        //Imprimir por consola el rango de cada variable
        System.out.println("--------------------");
        System.out.println("Rango del SHORT: min = " + Short.MIN_VALUE + " MAX = " + Short.MAX_VALUE);
        System.out.println("Rango del INT: min = " + Integer.MIN_VALUE + " MAX = " + Integer.MAX_VALUE);
        System.out.println("Rango del LONG: min = " + Long.MIN_VALUE + " MAX = " + Long.MAX_VALUE);
        System.out.println("Rango del FLOAT: min = " + Float.MIN_VALUE + " MAX = " + Float.MAX_VALUE);
        System.out.println("Rango del DOUBLE: min = " + Double.MIN_VALUE + " MAX = " + Double.MAX_VALUE);
        System.out.println("Rango del BOOL: min = " + " true or false");

        System.out.println("--------------------" + "\n");

        //Imprimir el valor de cada variable por consola
        System.out.println("--------------------");
        System.out.println("byte: " + Byte);
        System.out.println("Numero SHORT: " + numeroShort);
        System.out.println("Numero Int: " + numeroEntero);
        System.out.println("Numero LONG: " + numeroLong);
        System.out.println("Numero Float: " + numeroFloat);
        System.out.println("Numero Double: " + numeroDouble);
        System.out.println("Caracter: " + character);
        System.out.println("Booleano: " + booleano);
        System.out.println("--------------------" + "\n");
        
        //Suma
        System.out.println("++++++++++SUMA++++++++++\n");
        System.out.println("suma de numeros Short:\t" + numeroShort + numeroShort2);
        System.out.println("suma de numeros Enteros:\t" + numeroEntero + numeroEntero2);
        System.out.println("suma de numeros Long\t" + numeroLong + numeroLong2);
        System.out.println("suma de numeros float\t" + numeroFloat + numeroFloat2);
        System.out.println("suma de numeros Double:\t" + numeroDouble + numeroDouble2);
        System.out.println("Concatenación de String con caracter\t" + string + character + "\n");

        //Resta
        System.out.println("----------RESTA----------\n");
        System.out.println("Resta de numeros Short:\t" + (numeroShort - numeroShort2));
        System.out.println("Resta de numeros Enteros:\t" + (numeroEntero - numeroEntero2));
        System.out.println("Resta de numeros Long\t" + (numeroLong - numeroLong2));
        System.out.println("Resta de numeros float\t" + (numeroFloat - numeroFloat2));
        System.out.println("Resta de numeros Double:\t" + (numeroDouble - numeroDouble2) + "\n");

        //Multiplicación
        System.out.println("**********MULTIPLICACIÓN**********\n");
        System.out.println("Resta de numeros Short:\t" + (numeroShort * numeroShort2));
        System.out.println("Resta de numeros Enteros:\t" + (numeroEntero * numeroEntero2));
        System.out.println("Resta de numeros Long\t" + (numeroLong * numeroLong2));
        System.out.println("Resta de numeros float\t" + (numeroFloat * numeroFloat2));
        System.out.println("Resta de numeros Double:\t" + (numeroDouble * numeroDouble2) + "\n");

        //División
        System.out.println("**********DIVISIÓN**********\n");
        System.out.println("Resta de numeros Short:\t" + (numeroShort / numeroShort2));
        System.out.println("Resta de numeros Enteros:\t" + (numeroEntero / numeroEntero2));
        System.out.println("Resta de numeros Long\t" + (numeroLong / numeroLong2));
        System.out.println("Resta de numeros float\t" + (numeroFloat / numeroFloat2));
        System.out.println("Resta de numeros Double:\t" + (numeroDouble / numeroDouble2) + "\n");
    }
}
