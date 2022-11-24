public class Main {
    public static void main(String[] args){
        Cuenta cuenta_1 = new Cuenta("Angela Romero");
        Cuenta cuenta_2 = new Cuenta("Gabriela Silva", 200);

        //Ingresar dinero a la cuenta
        cuenta_1.ingresar(500);
        cuenta_2.ingresar(260);

        //Retirar dinero de la cuenta
        cuenta_1.retirar(50);
        cuenta_2.retirar(100);

        //Motraremos la informacion de la cuenta
        System.out.println(cuenta_1);//280
        System.out.println(cuenta_2);//360


        int a = 30;
        int b = 35;
        short c = 20;
        int suma = a+b+c;
        System.out.println(suma);
    }
 }




