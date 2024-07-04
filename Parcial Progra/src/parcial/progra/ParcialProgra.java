/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial.progra;

import javax.swing.JOptionPane;

/**
 *
 * @author sebastian
 */
public class ParcialProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Digite el nombre del agente de ventas");
        String cedula = JOptionPane.showInputDialog("Digite la cedula del agente de ventas");
        String codigo = JOptionPane.showInputDialog("Digite el codigo del agente de ventas");
        String sucursal = JOptionPane.showInputDialog("Digite la sucursal del agente de ventas");
        String vehiculo = JOptionPane.showInputDialog("¿El agente de ventas tiene vehiculo si/no?");
        // Solicitamos los datos del vendedor

        int cedulav = Integer.parseInt(cedula);
        int codigov = Integer.parseInt(codigo);

        Vendedor vendedor = new Vendedor("Sebastian", 1111, 222, "Escazu", "si");
        // Creamos el nuevo vendedor con los datos ingresados

        String cFacturas = JOptionPane.showInputDialog("Digite la cantidad de facturas a realizar");
        // Preguntamos cuántas facturas van a hacer

        int cantFacturas = Integer.parseInt(cFacturas);
        // Convertimos el String de la cantidad de facturas a un Int para trabajarlo

        for (int i = 0; i < cantFacturas; i++) { // Creamos el bucle para la cantidad de facturas

            String nomcliente = JOptionPane.showInputDialog("Digite el nombre del cliente");
            String ccliente = JOptionPane.showInputDialog("Digite la cedula del cliente");
            String codcliente = JOptionPane.showInputDialog("Digite el codigo del cliente");
            String mcliente = JOptionPane.showInputDialog("Digite el monto de la factura");
            String mes = JOptionPane.showInputDialog("Digite el numero de mes");
            String electrico = JOptionPane.showInputDialog("¿El cliente lleva algo electrico si/no?");
            String celecricos = JOptionPane.showInputDialog("¿Qué cantidad de cosas electricas lleva?");
            String constru = JOptionPane.showInputDialog("¿El cliente lleva algo de construccion si/no?");
            String cConstru = JOptionPane.showInputDialog("¿Qué cantidad de cosas de construccion lleva?");
            String autoM = JOptionPane.showInputDialog("¿El cliente lleva algo de automotriz si/no?");
            String cauto = JOptionPane.showInputDialog("¿Qué cantidad de cosas de automotriz lleva?");
            // Pedimos los datos de la factura

            int ClienteCed = Integer.parseInt(ccliente);
            int ClienteCod = Integer.parseInt(codcliente);
            int montoF = Integer.parseInt(mcliente);
            int Cmes = Integer.parseInt(mes);
            int cantElectricos = Integer.parseInt(celecricos);
            int cantConstru = Integer.parseInt(cConstru);
            int cantAuto = Integer.parseInt(cauto);
            // Convertimos los que hagan falta de String a int

            int comisiones = 0; // Preparamos los valores de comision de venta 
            int puntos = 0; // Preparamos los valores de los puntos obtenidos 

            if (cantElectricos >= 3) {
                comisiones += montoF * 0.04; // Hacemos los calculos de puntos y porcentajes
                puntos += 1;
            } else {
                comisiones += montoF * 0.02;
            }
            if (cantConstru < 1) {
                comisiones += montoF * 0.04;
                puntos += 2;
            } else {
                comisiones += montoF * 0.02;
            }
            if (cantAuto > 4) {
                comisiones += montoF * 0.04;
                puntos += 1;
            } else {
                comisiones += montoF * 0.02;
            }

            if (montoF > 50000) {
                puntos += 1;
                comisiones += 50000 + (5 / 100.0 * 50000); // Use esta formula V + (P/100*V)

            }

            switch (Cmes) { // Vemos cual fue el mes que se selecciono
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;
                default:
                    System.out.println("Mes inválido");
                    break;

            }
            // Crear la factura con los datos ingresados y calculados
            Facturas facturas1 = new Facturas(12345, 10000, 2, electrico, constru, autoM);
            JOptionPane.showMessageDialog(null, "el bono es de " + comisiones);
            JOptionPane.showMessageDialog(null,  "la cantidad de puntos  es de " + puntos);
        }

    }
}
