package empleado;

/**
 *
 * @author Miguel Angel Bustos
 */
public class TrabajadoresPorHoras extends Empleado {

    //ATRIBUTOS
    private int numeroHorasTrabajadas;
    private int salarioPorHora;

    //CONSTRUCTORES
    public TrabajadoresPorHoras() {

    }

    public TrabajadoresPorHoras(String nombre, String apellidos, int numHorasTrab, int salHora) {
        super(nombre, apellidos);
        numeroHorasTrabajadas = numHorasTrab;
        salarioPorHora = salHora;
    }

    //GETERS
    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public int getSalarioPorHora() {
        return salarioPorHora;
    }

    //SETTERS
    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public void setSalarioPorHora(int salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double salario() {
        int sal;
        sal = numeroHorasTrabajadas * salarioPorHora;
        return sal;
    }

    @Override
    public String toString() {
        return "TRABAJADOR POR HORAS " + super.toString();
    }

}
