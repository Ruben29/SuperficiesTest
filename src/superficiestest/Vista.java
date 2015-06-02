package superficiestest;

import superficiestest.Modelo;
import javax.swing.JOptionPane;
import static superficiestest.Controlador.calcular;

/**
 *
 * @author rfernandezgonzalez
 */
public class Vista {

    public static void menu(Modelo contenedor) {

        int opcion = 0;
        do {
            switch (Integer.parseInt(JOptionPane.showInputDialog("Que area deseas calcular? (cuadrado, circulo, triangulo, rectangulo):\n"
                    + "1.- CUADRADO\n"
                    + "2.- CIRCULO\n"
                    + "3.- TRIANGULO\n"
                    + "4.- RECTANGULO\n"
                    + "5.- SALIR\n"))) {
                case 1:
                    contenedor.setSelectArea(0);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("Cual es la longitud del lado?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 2:
                    contenedor.setSelectArea(1);
                    contenedor.setRadius(Float.valueOf(JOptionPane.showInputDialog("Cual es el radio del circulo?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 3:
                    contenedor.setSelectArea(2);
                    contenedor.setBaseLength(Float.valueOf(JOptionPane.showInputDialog("Cuanto mide la base del triangulo?")));
                    contenedor.setHeight(Float.valueOf(JOptionPane.showInputDialog("WCuanto mide la altura del triangulo?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 4:
                    contenedor.setSelectArea(3);
                    contenedor.setSideLength(Float.valueOf(JOptionPane.showInputDialog("Cuanto mide la base del rectangulo?")));
                    contenedor.setSideHeight(Float.valueOf(JOptionPane.showInputDialog("Cuanto mide la altura del rectangulo?")));
                    calcular(contenedor);
                    Vista.Imprimir(contenedor);
                    break;
                case 5:
                    System.exit(opcion);
                    break;
            }

        } while (opcion < 6 || opcion > 0);
    }

    public static void Imprimir(Modelo contenedor) {
        if (contenedor.getSelectArea() == 0) {
            JOptionPane.showMessageDialog(null, "El area del cuadrado es:  " + contenedor.getSquareArea());
        } else if (contenedor.getSelectArea() == 1) {
            JOptionPane.showMessageDialog(null, "El area del circulo es:  " + contenedor.getCircleArea());
        } else if (contenedor.getSelectArea() == 2) {
            JOptionPane.showMessageDialog(null, "El area del triangulo es:  " + contenedor.getTriangleArea());
        } else if (contenedor.getSelectArea() == 3) {
            JOptionPane.showMessageDialog(null, "El area del rectangulo es:  " + contenedor.getRectangleArea());
        }
    }

}
