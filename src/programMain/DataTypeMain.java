package programMain;

public class DataTypeMain {

    public static void main(String[] args) {
        //Tipos de datos en Java
        //Declaración de los diferentes tipos de datos en Java
        byte Byte;
        short numeroShort;
        int numeroEntero;
        long numeroLong;
        float numeroFloat;
        double numeroDouble;
        char character;
        boolean booleano;
        String string;

        //Asignación a cada variable declarada
        Byte = 2;
        numeroShort = 13;
        numeroEntero = 27;
        numeroLong = 1237;
        numeroFloat = numeroLong / numeroEntero;
        numeroDouble = 12412.21;
        character = 'ñ'; //Este tipo de dato puede tener cualquier valor de caracter
        booleano = true; //este tipo dato puede tener los valores de true  o false

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
    }
}
