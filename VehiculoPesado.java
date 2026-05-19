import java.util.*;

public class VehiculoPesado extends Vehiculo{

    private int peso;

     public VehiculoPesado(){
        super();
        setPeso(0);
    }
    public VehiculoPesado(String modelo, String marca, String color, int anio, String matricula, int peso){

        super(modelo, marca, color, anio, matricula);
        setPeso(peso);
    }

    public void setPeso(int peso){
        this.peso = peso;
    }

    public int getPeso(){
        return peso;
    }

    public void leerDatosVP(){

        Scanner sc = new Scanner(System.in);

        leerDatos();

        System.out.print("Capacidad de pasajeros: ");
        int peso = sc.nextInt();

        setPeso(peso);

    }
    public void imprimirDatos(){

        imprimir();

        System.out.println("Peso(En kg): " + getPeso());
    }

}