import java.util.* ;

public class Calculadora{

    Scanner sc = new Scanner(System.in);

    public Calculadora(){


    }

    public void Suma(){

        System.out.printf("\nIngrese la cantidad de numeros que desee sumar: ");
        int cantidad = sc.nextInt();

        if(cantidad > 1){

            int suma = 0;

            for(int i = 0; i < cantidad; i ++){

               System.out.printf("numero " + (i+1) + ": ");
               int num = sc.nextInt();

               suma += num;
            }

            System.out.println("Resultado: " + suma);
        }
        else{
            System.out.println("\nError. Tiene que ser 2 numeros o mas.");
            
        }


    }

    public void Resta(){

        System.out.printf("\nIngrese la cantidad de numeros que desee restar: ");
        int cantidad = sc.nextInt();

        if(cantidad > 1){

            System.out.printf("Numero 1: ");
            int resta = sc.nextInt();

            for(int i = 1; i < cantidad; i ++){

               System.out.printf("numero " + (i+1) + ": ");
               int num = sc.nextInt();

               resta -= num;
            }

            System.out.println("Resultado: " + resta);
        }
        else{
            System.out.println("\nError. Tiene que ser 2 numeros o mas.");
            
        }


    }

    public void Multiplicacion(){

        System.out.printf("\nIngrese la cantidad de numeros que desee multiplicar: ");
        int cantidad = sc.nextInt();

        if(cantidad > 1){

            System.out.printf("numero 1: ");
            int producto = sc.nextInt();

            for(int i = 1; i < cantidad; i ++){

               System.out.printf("numero " + (i+1) + ": ");
               int num = sc.nextInt();

               producto *= num;
            }

            System.out.println("Resultado: " + producto);
        }
        else{
            System.out.println("\nError. Tiene que ser 2 numeros o mas.");
            
        }

    }

    public void Division(){

        System.out.printf("\nIngrese la cantidad de numeros que desee dividir: ");
        int cantidad = sc.nextInt();

        if(cantidad > 1){

            System.out.printf("Numero 1: ");
            float cociente = sc.nextFloat();

            for(int i = 1; i < cantidad; i ++){

               System.out.printf("numero " + (i+1) + ": ");
               float num = sc.nextInt();

               cociente /= num;
            }

            System.out.println("Resultado: " + cociente);
        }
        else{
            System.out.println("\nError. Tiene que ser 2 numeros o mas.");
            
        }


    }

    public void menuCalculadora()
    {
        Scanner sc = new Scanner(System.in);

        int opcion;

       do{
          System.out.println("\n----------------------------------------------------------");
          System.out.println("                    CALCULADORA SIMPLE                ");
          System.out.println("----------------------------------------------------------\n");

          System.out.println("1.Sumar.");
          System.out.println("2.Restar.");
          System.out.println("3.Multiplicar");
          System.out.println("4.Dividir");
          System.out.println("\n5.Salir.");

          System.out.printf("\nElija una opcion: ");

          opcion = sc.nextInt();

        

            switch(opcion){

                case 1:
                    Suma();
                    break;
                case 2:
                    Resta();
                    break;
                case 3:
                    Multiplicacion();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    break;
                default:
                    System.out.println("\nOpcion invalida. ");
                    break;
            }
        }while(opcion != 5);

    }


}