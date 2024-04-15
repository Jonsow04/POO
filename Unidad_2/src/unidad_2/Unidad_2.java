    
package unidad_2;

import javax.swing.JOptionPane;

public class Unidad_2 {

    public static void main(String[] args) {
        String cadena = JOptionPane.MESSAGE_PROPERTY;
        //cadena = JOptionPane.showMessageDialog(null,"Hola: " + cadena);
        
        // Instanciar objeto
        Notas n = new Notas();
        n.ponNotas(77, 69, 44);
        
        // Se manda llamar al método estático directamente sin necesidad de instanciar
        Saludo();
        // Trabajar en java class. Crear un método estático con 2 parametros
        // Aplicar operación, generar resultados
        // Instanciar método desde main class
        
        // Instanciar objeto estático
        Notas.notasEstatico();
        
        // Instanciar objeto estático
        Notas.mediaArit();
        
        // Instanciar método estático
        Notas.mediaArit();
        
        
    }
    
    // Se crea método estático. Su única función será saludar
    public static void Saludo(){
        System.out.println("Jon Snow");
    }    
}
