package boletos;

import java.util.Date;

public class Boleto {
    private int id;
    private String nombre;
    private int tipoViaje;
    private String destino;
    private int precio=950;
    public static final int IMPUESTO=16;
    private Date fecha=new Date();;
    private static int contador;

    public Boleto() {
        this.id=++Boleto.contador;
    }

    public Boleto(String nombre, int tipoViaje,String destino, Date fecha) {
        this();
        this.nombre = nombre;
        this.tipoViaje = tipoViaje;
        this.destino=destino;
        this.fecha = fecha;
    }
    
    public Boleto(Boleto boleto){
        System.out.println("Id: "+boleto.nombre);
        System.out.println("Nombre: "+boleto.nombre);
        System.out.println("Tipo de viaje: "+boleto.tipoViaje);
        System.out.println("Destino: "+boleto.destino);
        System.out.println("Fecha: "+boleto.fecha);
    }
    public int calcularImpuesto(){
        int total=(this.precio*Boleto.IMPUESTO)/100;
        return total;
    }
    public int calcularSubtotal(){
        if(this.tipoViaje==2){
            this.precio=(this.precio*80)/100+this.precio;
        }
        else if(this.precio==1){
            this.precio=950;
        }
        return this.precio;
    }
    public int calcularDescuento(int edad){
        int descuento=0;
        if(edad>60){
            descuento=this.precio*50/100;
        }
        return descuento;
    }
    public int calcularTotal(int subtotal,int impuesto, int descuento){
        int total=subtotal+impuesto+descuento;
        return total;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public void imprimir(int descuento,int total){
        System.out.println("Id: "+this.id);
        System.out.println("El subtotal es de: "+this.precio);
        System.out.println("El impuesto es de: "+calcularImpuesto());
        System.out.println("El descuento es de: "+descuento);
        System.out.println("El total a pagar es de: "+total);
    }
    
}
