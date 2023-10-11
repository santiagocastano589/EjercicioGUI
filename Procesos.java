 
public class Procesos {
	
    public double calcularDescuento(double salario, int estrato) {
        double descuento = 0.0;

        if (estrato == 1 || estrato == 2) {
            descuento = 0.02;
        } else if (estrato == 3 || estrato == 4) {
            descuento = 0.04;
        } else if (estrato == 5) {
            descuento = 0.08; 
        } else if (estrato == 6) {
            descuento = 0.10; 
        }
 
        
        return salario*descuento;
    }
}