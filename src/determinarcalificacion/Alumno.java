/*
Clase contenedora alumn
 */
package determinarcalificacion;

/**
 *
 * @author carlosjoseanguiano
 */
public class Alumno {

    private String alumno;
    private int calificacion;

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Alumno(String alumno, int calificacion) {
        this.alumno = alumno;
        this.calificacion = calificacion;
    }

    public Alumno() {

    }

}
