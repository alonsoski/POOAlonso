// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//Esta es una evidencia de que pude instalar intellij en mi computador personal, Mi nombre es Jose Alonso

public class Main {
    public static void main(String[] args) {
        String text = "Hola como estas";
        invertir(text);
        int numeros[] ={1,2,3,4,5,6,7,8,9,10,11};
        suma(numeros);

        double[] notas={30,40,70,10};
        mostrarNotas(calcularNota(notas));

        int[] creditoYCuotas={2500000,20};
        calculoCredito(creditoYCuotas);

    }

    public static void calculoCredito(int[] creditoYCu){
        double interes=0;
        int cuotas=creditoYCu[1];
        if (creditoYCu[0]<=1000000){
            if (cuotas>0 && cuotas<=12){
                interes=1.25;
            }else if (cuotas>12 && cuotas<=23) {
                interes=1.30;
            }else if (cuotas>23) {
                interes=1.35;
            }
        } else if (creditoYCu[0]>1000000) {
            if (cuotas>0 && cuotas<=12){
                interes=1.15;
            }else if (cuotas>12 && cuotas<=23) {
                interes=1.20;
            }else if (cuotas>23) {
                interes=1.25;
            }
        }
        String txt1="Monto total a pagar:"+(creditoYCu[0]*interes);
        String txt2="Cuota Mensual:"+((creditoYCu[0]*interes)/creditoYCu[1]);
        String resultado= "{"+txt1+","+txt2+"}";
        System.out.println(resultado);
    }
    public static void invertir(String texto) {
    System.out.println(texto);
        for (int i = texto.length()-1; i > -1; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }
    public static void suma(int[] numeros){
        int acumulador=0;
        for (int i = 0; i <numeros.length ; i++) {
            if (numeros[i]%2==0){
                acumulador+=numeros[i];
            }
        }
        System.out.println(acumulador);

    }

    public static void mostrarNotas(double nota){
        if (nota>=40){
            System.out.println("felicidades aprobaste con un "+nota);
            return;
        } else if (nota<36) {
            System.out.println("reprobaste con un"+nota);

        }else {
            System.out.println("vas a examen con un "+nota);
        }
    }

    public static double calcularNota(double[] notas){
        int cantidadDeNotas= notas.length;
        double sumNotas= sumaNotas(notas);
        double promedio= sumNotas/cantidadDeNotas;
        return promedio;
    }
    public  static double sumaNotas(double[] notas){
        double acumulador=0;
        for (int i = 0; i <notas.length ; i++) {
            acumulador += notas[i];
        }
        return acumulador;
    }
}