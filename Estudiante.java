import java.util.Scanner;

public class Estudiante{

    private String nombre;
    private String matricula;
    private int edad;
    private String carrera;

    public Estudiante(){
        
        setNombre("");
        setMatricula("");
        setEdad(0);
        setCarrera("");

    }
    public Estudiante(String nombre, String matricula, int edad, String carrera){

        setNombre(nombre);
        setMatricula(matricula);
        setEdad(edad);
        setCarrera(carrera);
    }

    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getEdad(){
        return edad;
    }
    public String getCarrera(){
        return carrera;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

     public void leerDatosEstudiante(){
    
        Scanner sc = new Scanner(System.in);

        System.out.printf("Escriba el nombre: ");
        String nombre = sc.nextLine();

        System.out.printf("Escriba la edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.printf("Digite la maricula: ");
        String matricula = sc.nextLine();

        System.out.printf("Digite el nombre de la carrera: ");
        String carrera = sc.nextLine();
        
        setNombre(nombre);
        setEdad(edad);
        setMatricula(matricula);
        setCarrera(carrera);

        System.out.println();

    }

    public void imprimir(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Matricula:" + getMatricula());
        System.out.println("Carrera: " + getCarrera());
        
        System.out.println();
    }

    

}


