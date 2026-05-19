import java.util.* ;

public class Motos extends Vehiculo{

     private int cilindros;

    public Motos(){
        super();
        setCilindros(0);
    }
    public Motos(String modelo, String marca, String color, int anio, String matricula, int cilindros){

        super(modelo, marca, color, anio, matricula);
        setCilindros(cilindros);
    }

    public void setCilindros(int cilindros){
        this.cilindros = cilindros;
    }

    public int getCilindros(){
        return cilindros;
    }

    public void leerDatosMoto(){

        Scanner sc = new Scanner(System.in);

        leerDatos();

        System.out.print("Cilindros: ");
        int cilindros = sc.nextInt();

        setCilindros(cilindros);

    }
    public void imprimirDatos(){

        imprimir();

        System.out.println("Cilindros: " + getCilindros());
    }


}