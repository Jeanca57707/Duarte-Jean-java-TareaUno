import java.util.* ;

public class Vehiculo{

    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private String matricula;

    public Vehiculo(){

        setModelo("");
        setMarca("");
        setColor("");
        setAnio(0);
        setMatricula("");
    }

    public Vehiculo(String modelo, String marca, String color, int anio, String matricula){

        setModelo(modelo);
        setMarca(marca);
        setColor(color);
        setAnio(anio);
        setMatricula(matricula);
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getMarca(){
        return marca;
    }
     public String getModelo(){
        return modelo;
    }
     public String getColor(){
        return color;
    }
     public int getAnio(){
        return anio;
    }
     public String getMatricula(){
        return matricula;
    }

    public void leerDatos(){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Marca: ");
        String marca = sc.nextLine();

        System.out.printf("Modelo: ");
        String modelo = sc.nextLine();

        System.out.printf("Color: ");
        String color = sc.nextLine();

        System.out.printf("Anio: ");
        int anio = sc.nextInt();

        sc.nextLine();

        System.out.printf("Matricula: ");
        String matricula = sc.nextLine();

        setModelo(modelo);
        setMarca(marca);
        setColor(color);
        setAnio(anio);
        setMatricula(matricula);

    }

    public void imprimir(){

        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Color: " + getColor());
        System.out.println("Anio: " + getAnio());
        System.out.println("Matricula: " + getMatricula());

    }
    
}