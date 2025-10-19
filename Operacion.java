
package laboratorio;


public class Operacion {
    public static Object[] calcularVenta(int cantidad, double precioUnitario) {
       
        double subtotal = cantidad * precioUnitario;
        
        
        double descuentoPorcentaje = 0;
        
        if (cantidad > 20) {
            descuentoPorcentaje = 0.15;
        } else if (cantidad > 12) {
            descuentoPorcentaje = 0.10;
        } else if (cantidad >= 6) {
            descuentoPorcentaje = 0.05;
        }
        
       
        double descuentoMonto = subtotal * descuentoPorcentaje;
        double total = subtotal - descuentoMonto;
        
        
        return new Object[]{
            subtotal,
            descuentoPorcentaje * 100, 
            descuentoMonto,            
            total                      
        };
    }
}
