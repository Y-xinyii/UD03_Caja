import java.util.Scanner;

public class CajaTienda{
    public static void main(String[] args) {
        
        Scanner x = new Scanner(System.in);

        int opcion = 0;

        double contador = 0;      
        double total = 0;
        double ventaMayor = 0;
        double media;
        
        do { 
            System.out.println("                           ");
            System.out.println("--------Caja Tienda--------");
            System.out.println("1 - Añadir venta");
            System.out.println("2 - Ver total y número de ventas");
            System.out.println("3 - Ver media por venta");
            System.out.println("4 - Ver la venta mayor");
            System.out.println("5 - FIN");
            System.out.println("--------------------------------");
            System.out.println("                           ");

            System.out.print("Introducir una opción: ");
            opcion = x.nextInt();

        
            switch (opcion) {
                case 1:
                    System.out.print("Introducir un importe: ");
                    double importe = x.nextDouble();
                    if(importe <= 0){
                        System.out.println("El importe debe ser mayor que cero");
                    
                    } else {
                        contador++;                     
                        total = total + importe;
                        
                        if(total > ventaMayor){
                            ventaMayor = total;
                        }
                    }
                
                   break;

                case 2:
                    System.out.println("El total es: " + total + "euros.");
                    System.out.println("Números de ventas son: " + contador);
                    
                   break;

                case 3:
                    if (contador == 0 ){
                        System.out.println("Todavía no hay ninguna venta.");
                    }else{
                        media = total/contador;
                    System.out.println("Media por venta es: " + media );

                    }
                   break;

                case 4:
                    if (ventaMayor != 0){
                        System.out.println("La venta mayor es: " + ventaMayor);

                    }else{
                        System.out.println("No hay venta mayor.");

                    }
                    
                     
                   break;

                case 5:
                    System.out.println("FIN");
                   break;

                default:

                System.out.println("Opción no válida, intentar de nuevo.");
                return;
            }

            } while (opcion != 5);

            x.close();
       
    }
}


