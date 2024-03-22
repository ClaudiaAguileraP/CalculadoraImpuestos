package model;

import constants.NumericConstants;

public class Empleado {

    // Atributos

    private String _nombre;
    private double _sueldo;
    private double _impuesto;
    private double _afp;
    private double _salud;
    private double _sueldoLiquido;
    private String _resumen;
   private String formato = "%." + NumericConstants.DECIMALES + "f";
    // Constructor
    public Empleado(String nombre, double sueldo) {
        _nombre = nombre;
        _sueldo = sueldo;
        // Calcula los valores
        this._impuesto = calcularImpuestos();
        this._afp = calcularAfp();
        this._salud = calcularSalud();
        this._sueldoLiquido = cacularSueldoLiquido();
    }


    // Métodos
    private double calcularImpuestos() {
        // Calcular
        return 0;
    }
    private double calcularAfp() {
        // Calcular
        return 0;
    }

    private double calcularSalud() {
        // Calcular
        return 0;
    }

    private double cacularSueldoLiquido() {
        // Calcular
        return 0;
    }

    @Override
    public String toString() {

        // Cantidad decimales
        this._resumen = "Nombre: " + this._nombre + "\n";
        this._resumen += "Sueldo: " + getSueldoFormateado() + "\n";
        this._resumen += "Impuesto: " + getImpuestoFormateado() + "\n";
        this._resumen += "AFP: " + getAfpFormateado() + "\n";
        this._resumen += "Salud: " + getSaludFormateado() + "\n";
        this._resumen += "Sueldo líquido: " + getSueldoFormateado() + "\n";
        return this._resumen;
    }


    // Getters
    public String getNombre() {
        return _nombre;
    }

    public String getSueldoFormateado() {
        return String.format(formato, _sueldo);
    }

    public String getImpuestoFormateado() {
        return String.format(formato, _impuesto);
    }

    public String getAfpFormateado() {
        return String.format(formato, _afp);
    }

    public String getSaludFormateado() {
        return String.format(formato, _salud);
    }

    public String getSueldoLiquidoFormateado() {
        return String.format(formato, _sueldoLiquido);
    }
}
