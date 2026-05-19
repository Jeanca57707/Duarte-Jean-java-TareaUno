import java.util.* ;

public class Carro extends Vehiculo{

    private int capacidad;

    public Carro(){
        super();
        setCapacidad(0);
    }
    public Carro(String modelo, String marca, String color, int anio, String matricula, int capacidad){

        super(modelo, marca, color, anio, matricula);
        setCapacidad(capacidad);
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public int getCapacidad(){
        return capacidad;
    }

    public void leerDatosCarro(){

        Scanner sc = new Scanner(System.in);

        leerDatos();

        System.out.print("Capacidad de pasajeros: ");
        int capacidad = sc.nextInt();

        setCapacidad(capacidad);

    }
    public void imprimirDatos(){

        imprimir();

        System.out.println("Capacidad de pasajeros: " + getCapacidad());
    }

}