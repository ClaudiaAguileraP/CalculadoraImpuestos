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
        this._impuesto = 0;
        if (this._sueldo >= NumericConstants.SUELDO_A[0] && this._sueldo <= NumericConstants.SUELDO_A[1]) {
            this._impuesto = this._sueldo * NumericConstants.IMPUESTO_1;
        }
        else if (this._sueldo >= NumericConstants.SUELDO_B[0] && this._sueldo <= NumericConstants.SUELDO_B[1]) {
            this._impuesto = this._sueldo * NumericConstants.IMPUESTO_2;
        } else if (this._sueldo > NumericConstants.SUELDO_C[0]) {
            this._impuesto = this._sueldo * NumericConstants.IMPUESTO_3;
        }
        return this._impuesto;
    }
    private double calcularAfp() {
        this._afp = this._sueldo * NumericConstants.AFP;
        return this._afp;
    }

    private double calcularSalud() {
        this._salud = this._sueldo * NumericConstants.SALUD;
        return this._salud;
    }

    private double cacularSueldoLiquido() {
        this._sueldoLiquido = this._sueldo - this._impuesto - this._afp - this._salud;
        return this._sueldoLiquido;
    }

    @Override
    public String toString() {

        // Cantidad decimales
        this._resumen = "Nombre: " + this._nombre + "\n\n";
        this._resumen += "Sueldo: " + getSueldoFormateado() + "\n";
        this._resumen += "Impuesto: " + getImpuestoFormateado() + "\n";
        this._resumen += "AFP: " + getAfpFormateado() + "\n";
        this._resumen += "Salud: " + getSaludFormateado() + "\n";
        this._resumen += "Sueldo líquido: " + getSueldoLiquidoFormateado() + "\n";
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
