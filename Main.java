import java.util.* ;

public class Main{

    public static void main (String[] args){

      Menu();

    }

    //FUNCION PARA SABER SI EUN NUMERO ES PAR O IMPAR
    public static void Par_Impar(int num){

        if( num % 2 == 0){

            System.out.println("El numero " + num + " es PAR.");
        }
        else{

            System.out.println("El numero " + num + " es IMPAR");
        }
    }

    //FUNCION PARA TABLA DE MULTIPLICAR
    public static void Tabla(int num){

        for( int i = 1; i < 11; i++){

            int producto = num * i;
            System.out.println(i + "x" + num + " = " + producto);
        }
    }

    //FUNCION QUE CUENTA LAS VOCALES DE UNA PALABRA O FRASE
    public static void ContarVocales(String p){

        String palabra = p.toLowerCase();
        
        int contador = 0;

        for(int i = 0; i < palabra.length(); i ++){

            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){

                contador ++;
            }
        }
        System.out.println("\nLa palabra o frase tiene " + contador + " vocales.\n");
    }
    //METODO PARA CREAR UNA MATRIZ 3X3
    public static void Matriz(){

        Scanner sc = new Scanner(System.in);

        int [][] matriz = new int [3][3];

        for(int i = 0; i < 3; i ++){

            for( int j = 0; j < 3; j ++){

                System.out.printf("Digite el valor de la posicion " + (i+1) + "," + (j+1) +": ");
                int p = sc.nextInt();
                matriz[i][j] = p;
            }    
        }
        System.out.println("\nMatriz resultante: \n");

        //BUCLE FOR PARA IMPRIMIR LA MATRIZ

        for(int k = 0; k < 3; k++){
            for(int l = 0; l < 3; l++){

             System.out.print(matriz[k][l] + " ");

            }
            System.out.println();
        }
    }

    public static void Promedio(){

        int credTotales = 0;
        double sumaNotas = 0;


        Scanner sc = new Scanner(System.in);
        System.out.printf("\nIngrese la cantidad de notas: " + "\n");
        int cantidad = sc.nextInt();

        for(int i = 0; i < cantidad; i++){

            System.out.printf("Ingrese la calificacion " + (i+1) + ": ");
            double nota = sc.nextDouble();

            System.out.printf("Ingrese su cantidad de creditos: ");
            int creditos = sc.nextInt();

            credTotales += creditos;

            sumaNotas += nota * creditos;

        }
        double promedio = sumaNotas / credTotales;

        System.out.printf("\nEl promedio final es de: %.2f", promedio);

    }


    public static void Menu(){

        Scanner sc = new Scanner(System.in);

        int opcion;

        do{

          System.out.println("\n-------------------------------------------------------");
          System.out.println("                    MENU PRINCIPAL                ");
          System.out.println("-------------------------------------------------------\n");

          System.out.println("1.Calculadora Simple.");
          System.out.println("2.Numero par o impar.");
          System.out.println("3.Tabla de Multiplicar.");
          System.out.println("4.Contador de vocales.");
          System.out.println("5.Promedio de notas.");
          System.out.println("6.Clase Estudiante.");
          System.out.println("7.Cuenta Bancaria.");
          System.out.println("8.Herencia vehiculo.");
          System.out.println("9.Matriz 3x3.");
          System.out.println("10.Sistema Basico de Inventario.");

          System.out.println("\n11.Salir.");

          System.out.printf("\nEjlija una opcion: ");
          opcion = sc.nextInt();


          switch(opcion){

            case 1:
                Calculadora c = new Calculadora();
                c.menuCalculadora();
                break;

            case 2:
                System.out.printf("Digite un numero: ");
                int num = sc.nextInt();
                Par_Impar(num);
                break;
            
            case 3:
                System.out.printf("¿Que tabla desea? (Escriba el número): ");
                int numero = sc.nextInt();
                System.out.println("\n--------TABLA DEL " + numero + "---------\n");
                Tabla(numero);
                break;
            
            case 4:
                System.out.println("Escriba una palabra o frase: ");
                sc.nextLine();
                String palabra = sc.nextLine();
                ContarVocales(palabra);
               
                break;

            case 5:
                System.out.println("\n------CALCULO DE PROMEDIO------\n");
                Promedio();
                break;

            case 6:
                System.out.println("\n-----Ingresar Estudiante-----\n");
                Estudiante estudiante = new Estudiante();
                estudiante.leerDatosEstudiante();

                System.out.println("\n-----Informacion del estudiante-----\n");
                estudiante.imprimir();
                
                break;  

            case 7:
                CuentaBancaria cuenta = new CuentaBancaria("01-34", "Corriente", 23000, "Jean Carlos");
                cuenta.Menu();

                break;

            case 8:

                System.out.println("\n----------------HERENCIA DE VEHICULOS---------------\n");

                System.out.println("\n--------------CARRO--------------\n");
    
                Carro carro = new Carro("Nissan GT-R", "Nissan", "Blanco", 2017, "A-HG10LAKS", 5 );
                carro.imprimir();

                System.out.println("\n--------------MOTOR--------------\n");

                Motos m = new Motos("VS8", "Yamaha", "Azul", 2015, "G.PKLWKAQO12", 1);
                m.imprimir();

                System.out.println("\n--------------VEHICULO PESADO--------------\n");

                VehiculoPesado p = new VehiculoPesado("Patana","Isuzu","Negra", 2010, "P-098PLAG", 150);
                p.imprimir();

                break;
                

            case 9:
                System.out.println("\n-----CREA TU PROPIA MATRIZ 3X3-----\n");
                Matriz();

                break;

            case 10:
                Inventario inventario = new Inventario();
                inventario.MenuInventario();
                
                break;
                
            case 11:
                System.out.println("\nSaliendo del Programa...");
                break;

            default:
                System.out.println("\nOpcion Invalida.");
                break;
          }

        }while(opcion != 11);
   
    }
}