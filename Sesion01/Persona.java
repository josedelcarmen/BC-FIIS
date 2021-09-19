public class Persona {
    /***** Atributos == Campos == Propiedades == Datos *****/
    /* Variables de clase*/
    static int ultimoId = 0;
    /* Variables de instancia*/
    int id;
    String nombres, apellidoPaterno, apellidoMaterno;
    /* Métodos == Operaciones == Mensajes == */
    /* Constructores */
    // primer constructor
    public Persona(){
        ultimoId++;
        this.id = ultimoId; // Actualizar el id
    }
    // segundo constructor
    public Persona(String nom, String apeMat, String apePat){
        this(); // Llamada al primer constructor
        this.nombres = nom;
        this.apellidoMaterno = apeMat;
        this.apellidoPaterno = apePat;
    }

    /* Métodos de clase */
    public static int getUltimoId() {
        return ultimoId;
    }
    /* Métodos de Instancia */
    /* Métodos accesores: getter(para obtener datos) y setter(cambiar el dato) */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                '}';
    }
}
