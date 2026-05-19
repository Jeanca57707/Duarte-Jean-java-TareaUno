import java.util.* ;
 
public class Inventario{

    private String objeto;

    public Inventario(){

        setObjeto("");
    }
    public Inventario(String objeto){
        
        setObjeto(objeto);
    }

    public void setObjeto(String objeto){
        this.objeto = objeto;
    }

    public String getObjeto(){
        return objeto;
    }

    public void AgregarObjeto(){

        Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese un objeto al inventario: ");
        String objeto= sc.nextLine();

        setObjeto(objeto);

        System.out.println();

    }
    public void imprimir(){

        System.out.println("Objeto: " + getObjeto());
    }


    public void MenuInventario(){

        Scanner sc = new Scanner(System.in);

        ArrayList<Inventario> inventario = new ArrayList<>();

        int opcion;

        do {

          System.out.println("\n-------------------------------------------");
          System.out.println("                  INVENTARIO               ");
          System.out.println("--------------------------------------------\n");

          System.out.println("1.Agregar objeto.");
          System.out.println("2.Ver inventario.");
          System.out.println("\n3.Salir.");

          System.out.print("\nElija una opcion: ");

          opcion = sc.nextInt();
          sc.nextLine();


          switch(opcion){

            case 1:

                Inventario i = new Inventario();

                i.AgregarObjeto();

                inventario.add(i);

                System.out.println("¡Objeto Agregado!");

                break;
            
            case 2:

                if (inventario.isEmpty()){

                    System.out.println("\nInventario Vacío");
                    
                }
                else{

                    System.out.println("\n-------INVENTARIO------");

                    for(int j = 0; j < inventario.size(); j++){

                        inventario.get(j).imprimir();
                    }
                }
                break;
            case 3:
                System.out.println("\nSaliendo del inventario...");
                break;
            
            default:
                System.out.println("\nOpcion invalida.");
          }
          
        }while(opcion != 3);
    }
}