package empleado;

/**
 *
 * @author Miguel Angel Bustos
 */
public class JefesDeProyectos extends Empleado {

    //ATRIBUTOS
    private double salarioBase;
    private int numeroProyectos;
    private static final double incentivo=60;

    //CONSTRUCTORES
    public JefesDeProyectos() {

    }

    public JefesDeProyectos(String nombre, String apellidos, double salBas, int numProy) {
        super(nombre, apellidos);
        salarioBase = salBas;
        numeroProyectos = numProy;
    }

    //GETTERS
    public double getSalarioBase() {
        return salarioBase;
    }

    public int getNumeroProyectos() {
        return numeroProyectos;
    }

    public static double getIncentivo() {
        return incentivo;
    }

    //SETTERS
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNumeroProyectos(int numeroProyectos) {
        this.numeroProyectos = numeroProyectos;
    }

    public double salario() {
        int sal;
        sal = (int) (salarioBase + incentivo * numeroProyectos);
        return sal;
    }

    @Override
    public String toString() {
        return "JEFE DE PROYECTO " + super.toString();
    }

}
