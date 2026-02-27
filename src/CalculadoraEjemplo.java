/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 * Clase CalculadoraEjemplo
 * 
 * Esta clase permite realizar operaciones matemáticas básicas
 * como suma, resta, multiplicación y división.
 * 
 * @author cinti
 * @version 1.0
 * @since 2026
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {
    
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor de la clase CalculadoraEjemplo
     * 
     * @param operando1 Primer número
     * @param operando2 Segundo número
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Método que realiza la suma
     * 
     * @return Resultado de la suma
     */
    public double suma() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Método que realiza la resta
     * 
     * @return Resultado de la resta
     */
    public double resta() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Método que realiza la multiplicación
     * 
     * @return Resultado de la multiplicación
     */
    public double multiplicacion() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Método que realiza la división
     * 
     * @return Resultado de la división
     */
    public double division() {
        if (operando2 == 0) {
            System.out.println("No se puede dividir entre cero");
            return 0;
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Método principal donde se prueban las operaciones
     * 
     * @param args Argumentos de línea de comandos
     */
    public static void main(String[] args) {

        CalculadoraEjemplo calc = new CalculadoraEjemplo(10, 5);

        System.out.println("Suma: " + calc.suma());
        System.out.println("Resta: " + calc.resta());
        System.out.println("Multiplicación: " + calc.multiplicacion());
        System.out.println("División: " + calc.division());
    }
}
