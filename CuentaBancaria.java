import java.util.*;

public class CuentaBancaria{

    private String numCuenta;
    private String tipoDeCuenta;
    private double saldo;
    private String titular;
    
    public CuentaBancaria(){

        setNumCuenta("");
        setTipoDeCuenta("");
        setSaldo(0.000);
        setTitular("");
        
    }

    public CuentaBancaria(String numCuenta, String tipoDeCuenta, double saldo, String titular){

        setNumCuenta(numCuenta);
        setTipoDeCuenta(tipoDeCuenta);
        setSaldo(saldo);
        setTitular(titular);
    }

    public void setNumCuenta(String numCuenta){
        this.numCuenta = numCuenta;
    }
    public void setTipoDeCuenta(String tipoDeCuenta){
        this.tipoDeCuenta = tipoDeCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setTitular(String titular){
        this.titular = titular;

    }

    public String getNumCuenta(){
        return numCuenta;
    }
    public String getTipoDeCuenta(){
        return tipoDeCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }

    public void Depositar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese la cantidad que depositará: ");
        double deposito = sc.nextDouble();

        saldo += deposito;

        System.out.println("\n¡Deposito realizado!");

    }

    public void Transferir(){

        Scanner sc = new Scanner(System.in);

        System.out.println("\nIngrese el titular: ");
        String nombre = sc.nextLine();

        System.out.println("\nIngrese el monto a transfererir: ");
        double monto = sc.nextDouble();

        if(monto < saldo){

            saldo -= monto;
            System.out.println("\n¡Transferencia exitosa!");
            System.out.println("\n¡Transferiste $" + monto + "DOP a " + nombre);

        }
        else{

            System.out.println("\nSaldo insuficiente.");
        }

     
    }

    public void Retirar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el monto a retirar: ");
        double monto = sc.nextDouble();

        if(monto <= saldo){

            saldo -= monto;
            System.out.println("Retiraste $" + monto +"DOP de tu cuenta."); 
        }
        else{
            
            System.out.println("EL monto solicitado supera el saldo de su cuenta");
        }
       
    }

    public void InformacionDeCuenta(){

        System.out.println("Titular: " + getTitular());
        System.out.println("Tipo de Cuenta: " + getTipoDeCuenta());
        System.out.println("Saldo: $" + saldo+"DOP");

    }

    public void Menu(){

        Scanner sc = new Scanner(System.in);

        int opcion;

       do{
          System.out.println("\n----------------------------------------------------------");
          System.out.println("                    CUENTA BANCARIA               ");
          System.out.println("----------------------------------------------------------\n");

          System.out.println("1.Depositar.");
          System.out.println("2.Transferir.");
          System.out.println("3.Retirar.");
          System.out.println("4.Informacion de cuenta.");
          System.out.println("\n5.Salir.");

          System.out.printf("\nElija una opcion: ");

          opcion = sc.nextInt();

        

            switch(opcion){

                case 1:
                    Depositar();
                    break;
                case 2:
                    Transferir();
                    break;
                case 3:
                    Retirar();
                    break;
                case 4:
                    InformacionDeCuenta();
                    break;
                case 5:
                    System.out.println("Volviendo al menu principal...");
                    break;
                default:
                    System.out.println("\nOpcion invalida. ");
                    break;
            }
        }while(opcion != 5);



    }
}