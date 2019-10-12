package empleado;

import javax.swing.DefaultListModel;

/**
 *
 * @author Miguel Angel Bustos
 */
public abstract class Empleado {

    //ATRIBUTOS
    static DefaultListModel modeloLista = new DefaultListModel();
    protected String nombre;
    protected String apellidos;

    //CONSTRUCTORES
    public Empleado() {

    }

    public Empleado(String name, String lastname) {
        nombre = name;
        apellidos = lastname;
        modeloLista.addElement(this);
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    //METODO TOSTRING
    public String toString() {

        return this.nombre + this.apellidos;
    }

    //METODO ABSTRACTO
    abstract public double salario();

}
