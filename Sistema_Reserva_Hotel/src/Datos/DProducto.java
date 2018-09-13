
package Datos;



public class DProducto {
    
    private String nombre;
    private String descripcion;
    private String unidadMedida;
    private double precioVenta;
    
    
    public DProducto(){
        
    }

    public DProducto(int idproducto, String nombre, String descripcion, String unidadMedida, double precioVenta) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.unidadMedida = unidadMedida;
        this.precioVenta = precioVenta;
    }
    
    
    private int idproducto;

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    
}
