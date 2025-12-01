package Tema2;

import java.util.Scanner;

public class EjercicioExamen2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int horas = 0;
            int minutos = 0;
            int dia=0;
            int horasJapon=0;
            int horasSpain=0;

            int pais=0;
            System.out.println("Dime el pais en el que estas 1 para españa o 2 para japon");
            pais=input.nextInt();
            if( pais<1 || pais>2){
                System.out.println("Pais invalido");
            } else{
                System.out.println("dime la hora");
                horas=input.nextInt();}

            System.out.println("dime los minutos");
            minutos=input.nextInt();
            System.out.println("Dime que dia es de 1 al 7 siendo 1 lunes,2 martes etc....");
            dia=input.nextInt();
            System.out.println("estas en pais" +pais+ "y son las " +horas+ ":" +minutos +" y es " +dia);

            switch (dia){// para que aparezca el dia de la semana que es
                case 1:
                    String dia1="lunes";
                    System.out.println("Lunes");
                    break;
                case 2:
                    String dia2="martes";
                    System.out.println("Martes");
                    break;
                case 3:
                    String dia3="miercoles";
                    System.out.println("Miercoles");
                    break;
                case 4:
                    String dia4="jueves";
                    System.out.println("Jueves");
                    break;
                case 5:
                    String dia5="viernes";
                    System.out.println("Viernes");
                    break;
                case 6:
                    String dia6="sabado";
                    System.out.println("Sabado");
                    break;
                case 7:
                    String dia7="domingo";
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Dia invalido");
            }
            if(minutos == 60){
                minutos=0;
                horas++;
            }if(horas==24){
                horas=0;
                dia++;
            }if (dia>=7)
                dia=1;

            if(pais==1) {
                System.out.println("España");
                horasJapon=horas+8;
                System.out.println("en japon son las" +horasJapon+"del dia"+dia);

            } else if  (pais ==2){
                System.out.println("Japon");
                horasSpain=horas-8;
                System.out.println("en España son las" +horasSpain+"del dia"+dia);
            }
/// /
        }
    }

