/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.progra;

/**
 *
 * @author sebastian
 */
class Facturas {
//Creamos a los actores

    public int codFactura;
    public int monto;
    public int mes;
    public String electrico;
    public String construccion;
    public String automotriz;

    // Hacemos todos los constructores
    public Facturas(int codFactura, int monto, int mes, String electrico, String construccion, String automotriz) {
        this.codFactura = codFactura;
        this.monto = monto;
        this.mes = mes;
        this.electrico = electrico;
        this.construccion = construccion;
        this.automotriz = automotriz;
    }

    // Creamos todos los Sets and gets
    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getElectrico() {
        return electrico;
    }

    public void setElectrico(String electrico) {
        this.electrico = electrico;
    }

    public String getConstruccion() {
        return construccion;
    }

    public void setConstruccion(String construccion) {
        this.construccion = construccion;
    }

    public String getAutomotriz() {
        return automotriz;
    }

    public void setAutomotriz(String automotriz) {
        this.automotriz = automotriz;
    }
}
