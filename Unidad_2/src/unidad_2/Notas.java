
package unidad_2;

// Varialbe se crea (declara) / inicializar (asignación) / Recibir valor (argumento)
// Se crea java class Notas para determinar el calculo de medias sobre 3 calificaciones
public class Notas {
    // Declarar variables
    private int nota1, nota2, nota3;
    /*
    Pone los valores de las tres notas
    */
    // Relaciona variable globar y variable propia del método
    public void ponNotas(int n1, int n2, int n3){
        nota1 = n1;
        nota2 = n2;
        nota3 = n3;
    }
    // Se crea método para calcular la media real
    public double media(){
        return (nota1 + nota2 + nota3)/3.0;
    }
    // Se crea método para calcular la media entera
    public int mediaEntera(){
        return (nota1 + nota2 + nota3)/3;
    }
    // Se crea un método estático
    public static void notasEstatico(){
        int i = 1, j = 3;
        System.out.println(i + j); 
    }
    // Se crea método estático para el número de control
    public static void numControl(){
       int NC = 23550851;
       System.out.println(NC);
    }
    // Se crea método estático para la media aritmética
    public static void mediaArit(){
      int nota1 = 3, nota2 = 8, nota3 = 6;
      double media = (nota1 + nota2 + nota3)/3.0;
       
      System.out.println(media);
    }
}
