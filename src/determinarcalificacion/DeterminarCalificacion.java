/*
Desarrollar una aplicación que determine la calificación de un estudiante universitario 
de acuerdo a la siguiente condición: de 0 hasta 5 será Malo; más de 5 hasta 7 
será Regular; más de 7 hasta 8 será Bueno; de 9 hasta 10 será Excelente. 
Se debe considerar que hay que validar la nota ingresada ya que esta no puede ser menor 
que 0 (cero) o mayor que 20.
 */
package determinarcalificacion;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author carlosjoseanguiano
 */
public class DeterminarCalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int calificacion;
        String estudiante;

        JFrame jFrame = new JFrame("My Frame");
        estudiante = JOptionPane.showInputDialog(jFrame, "Ingresa el nombre del alumno");
        calificacion = Integer.parseInt(JOptionPane.showInputDialog(jFrame, "Ingresa la calificacion"));

        if (calificacion >= 0 && calificacion <= 10) {

            if (calificacion >= 0 && calificacion <= 5) {
                System.out.println("Estudiando con promedio MALO");
            } else if (calificacion > 5 && calificacion <= 7) {
                System.out.println("Estudiando con promedio REGULAR");
            } else if (calificacion > 7 && calificacion <= 8) {
                System.out.println("Estudiando con promedio BUENO");
            } else if (calificacion == 9 || calificacion == 10) {
                System.out.println("Estudiando con promedio EXCELENTE");

            }
        } else {
            System.out.println("Verifica el valor de calificacion");
        }
    }

}
