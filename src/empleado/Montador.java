package empleado;

/**
 *
 * @author Miguel Angel Bustos
 */
public class Montador extends Empleado {

    //ATRIBUTOS
    private int numeroElectrodomesticos;
    private double importePorUnidad;

    //CONSTRUCTOR
    public Montador() {

    }

    public Montador(String nombre, String apellidos, int numElec, double importUnid) {
        super(nombre, apellidos);
        numeroElectrodomesticos = numElec;
        importePorUnidad = importUnid;
    }

    //GETERS
    public int getNumeroElectrodomesticos() {
        return numeroElectrodomesticos;
    }

    public double getImportePorUnidad() {
        return importePorUnidad;
    }

    //SETTERS
    public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
        this.numeroElectrodomesticos = numeroElectrodomesticos;
    }

    public void setImportePorUnidad(double importePorUnidad) {
        this.importePorUnidad = importePorUnidad;
    }

    public double salario() {
        int sal;
        sal = (int) (numeroElectrodomesticos * importePorUnidad);
        return sal;
    }

    @Override
    public String toString() {
        return "MONTADOR " + super.toString();
    }
}
