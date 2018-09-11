
package Datos;


public class DHabitacion {
    //atributos
    private int idhabitacion;
    private String numero;
    private String piso;
    private String descripcion;
    private String caracteristicas;
    private double precio_diario;
    private String estado;
    private String tipo_habitacion;
    
    public DHabitacion(){
    }

    public DHabitacion(int idhabitacion, String numero, String piso, String descripcion, String caracteristicas, double precio_diario, String estado, String tipo_habitacion) {
        this.idhabitacion = idhabitacion;
        this.numero = numero;
        this.piso = piso;
        this.descripcion = descripcion;
        this.caracteristicas = caracteristicas;
        this.precio_diario = precio_diario;
        this.estado = estado;
        this.tipo_habitacion = tipo_habitacion;
    }
    
    /**
     * @return the idhabitacion
     */
    public int getIdhabitacion() {
        return idhabitacion;
    }

    /**
     * @param idhabitacion the idhabitacion to set
     */
    public void setIdhabitacion(int idhabitacion) {
        this.idhabitacion = idhabitacion;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the piso
     */
    public String getPiso() {
        return piso;
    }

    /**
     * @param piso the piso to set
     */
    public void setPiso(String piso) {
        this.piso = piso;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the caracteristicas
     */
    public String getCaracteristicas() {
        return caracteristicas;
    }

    /**
     * @param caracteristicas the caracteristicas to set
     */
    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    /**
     * @return the precio_diario
     */
    public double getPrecio_diario() {
        return precio_diario;
    }

    /**
     * @param precio_diario the precio_diario to set
     */
    public void setPrecio_diario(double precio_diario) {
        this.precio_diario = precio_diario;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the tipo_habitacion
     */
    public String getTipo_habitacion() {
        return tipo_habitacion;
    }

    /**
     * @param tipo_habitacion the tipo_habitacion to set
     */
    public void setTipo_habitacion(String tipo_habitacion) {
        this.tipo_habitacion = tipo_habitacion;
    }
    
}
