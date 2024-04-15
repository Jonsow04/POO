package unidad_2;

class Vehiculo {
    // Se declaran las variables
    String matricula;
    String color;
    String modelo;
    // Se crea el constructor con los atributos matricula, color y modelo
    public Vehiculo(String matricula, String color, String modelo) {
        // Se utiliza la palabra reservada this para instanciar los objetos 
        // matricula, color y modelo
        this.matricula = matricula;
        this.color = color;
        this.modelo = modelo;
    }
}
// Se crea la clase Taxi que hereda a la super clase Vehiculo
class Taxi extends Vehiculo {
    // Se crea el constructor Taxi, que tiene los atributos matricula, color
    // y modelo
    public Taxi(String matricula, String color, String modelo) {
        // Con la palabra reservada super, se llama al constructor ya parametrizado
        super(matricula, color, modelo);

    }
}
// Se crea la clase Tranvia que hereda a la super clase Vehiculo
class Tranvia extends Vehiculo {
    // Se crea el constructor Tranvia, que tiene los atributos matricula, color
    // y modelo
    public Tranvia(String matricula, String color, String modelo) {
        // Con la palabra reservada super, se llama al constructor ya parametrizado
        super(matricula, color, modelo);
    }
}
// Se crea la clase Autobus que hereda a la super clase Vehiculo
class Autobus extends Vehiculo {
    // Se crea el constructor Autobus, que tiene los atributos matricula, color
    // y modelo
    public Autobus(String matricula, String color, String modelo) {
        // Con la palabra reservada super, se llama al constructor ya parametrizado
        super(matricula, color, modelo);
    }
}
