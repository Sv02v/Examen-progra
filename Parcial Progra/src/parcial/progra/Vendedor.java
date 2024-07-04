/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial.progra;

/**
 *
 * @author sebastian
 */
public class Vendedor {

    public String nombre;
    public int cedula;
    public int codigo;
    public String sede;
    public String vehiculo;
    public int puntos;
    public double comisiones;

    // Creamos los Constructores
    public Vendedor(String nombre, int cedula, int codigo, String sede, String vehiculo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sede = sede;
        this.vehiculo = vehiculo;
        this.puntos = 0;
        this.comisiones = 0;
    }

    //Creamos los  Sets y Gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getComisiones() {
        return comisiones;
    }

    public void setComisiones(double comisiones) {
        this.comisiones = comisiones;
    }

    public void Puntos(int puntos) {
        this.puntos += puntos;
    }

    public void Comision(double comision) {
        this.comisiones += comision;
    }
}
