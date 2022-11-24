public class Cuenta {
    //Atributos
    private String titular;
    private int cantidad;

    //Constructor del atributo titular y cantidad
    public Cuenta(String titular){
        this(titular, 0); //Sobrecarga
    }

    public Cuenta(String titular, int cantidad){
        this.titular = titular;
        //Si la cantidad es menor que cero, se colocara cero
        if (cantidad < 0){
            this.cantidad = 0;
        }else {
            this.cantidad = cantidad;
        }
    }

    //Metodos Getter, Setter y toString de titular y cantidad
    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    /* Ingres dinero en la cuenta
    solo si es positiva la cantidad
    @param cantidad
     */

    public void ingresar(int cantidad){
        if (cantidad > 0){
            this.cantidad += cantidad;
        }
    }

    //Retira cantidad de la cuenta, si se quedara en negativo
    //se queda en cero.

    public void retirar(int cantidad){
        if (this.cantidad - cantidad <0){
            this.cantidad = 0;
        }else {
            this.cantidad -= cantidad;
        }
    }

    //Devolvemos estado del objeto
    //@return
    @Override
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " quetzales en la cuenta";
    }


}
