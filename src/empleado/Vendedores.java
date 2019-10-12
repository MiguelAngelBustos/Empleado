package empleado;

/**
 *
 * @author Miguel Angel Bustos
 */
public class Vendedores extends Empleado {

    //ATRIBUTOS
    private int electrodomesticosVendidos;
    private double comision;
    private double salariobase;

    //CONSTRUCTOR
    public Vendedores() {

    }

    public Vendedores(String nombre, String apellidos, int eleVen, double com, double sala) {
        super(nombre, apellidos);
        electrodomesticosVendidos = eleVen;
        comision = com;
        salariobase = sala;
    }

    //GETTERS
    public int getElectrodomesticosVendidos() {
        return electrodomesticosVendidos;
    }

    public double getComision() {
        return comision;
    }

    //SETTERS
    public void setElectrodomesticosVendidos(int electrodomesticosVendidos) {
        this.electrodomesticosVendidos = electrodomesticosVendidos;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double salario() {
        int sal;
        sal = (int) (salariobase + electrodomesticosVendidos * comision);
        return sal;
    }

    @Override
    public String toString() {
        return "VENDEDOR " + super.toString();
    }
}
