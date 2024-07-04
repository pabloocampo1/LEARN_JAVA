public class POO {
    String nombre;
    int edad;

    public POO() {
       this.nombre = "juan";
       this.edad = 18;
    };
    public void presentarse () {
        System.out.println("hola, mi nombre es "+ this.nombre + "y tengo " + this.edad);
    };


    public static void main(String[] args) {
        POO PERSONA1 = new POO();
        PERSONA1.presentarse();;
        POO PERSONA2 = new POO();
        PERSONA2.presentarse();;
    }
}






