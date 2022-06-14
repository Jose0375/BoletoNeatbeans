package test;

import boletos.Boleto;
import java.util.*;

public class Prueba {
    public static void main(String[] args) {
        
        Date fecha=new Date();
        Boleto boleto=new Boleto("juan",1,"culiacan",fecha);
        
        int total=(boleto.calcularTotal(boleto.calcularSubtotal(), boleto.calcularImpuesto(), boleto.calcularDescuento(99)));
        boleto.imprimir(boleto.calcularDescuento(99),total );
        Boleto boleto2=new Boleto("alan",2,"culiacan",fecha);
        
        int total2=(boleto2.calcularTotal(boleto2.calcularSubtotal(), boleto2.calcularImpuesto(), boleto2.calcularDescuento(99)));
        boleto2.imprimir(boleto2.calcularDescuento(99),total );
        
    }
}
