
package Datos;

import java.sql.Date;


public class DPago {
    private int idpago;
    private int idreserva;
    private String tipo_comprobante;
    private String num_comprobante;
    private double igv;
    private double total_pago;
    private Date fecha_emision;
    private Date fecha_pago;

    public DPago() {
    }

    public DPago(int idpago, int idreserva, String tipo_comprobante, String num_comprobante, double igv, double total_pago, Date fecha_emision, Date fecha_pago) {
        this.idpago = idpago;
        this.idreserva = idreserva;
        this.tipo_comprobante = tipo_comprobante;
        this.num_comprobante = num_comprobante;
        this.igv = igv;
        this.total_pago = total_pago;
        this.fecha_emision = fecha_emision;
        this.fecha_pago = fecha_pago;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public String getTipo_comprobante() {
        return tipo_comprobante;
    }

    public void setTipo_comprobante(String tipo_comprobante) {
        this.tipo_comprobante = tipo_comprobante;
    }

    public String getNum_comprobante() {
        return num_comprobante;
    }

    public void setNum_comprobante(String num_comprobante) {
        this.num_comprobante = num_comprobante;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal_pago() {
        return total_pago;
    }

    public void setTotal_pago(double total_pago) {
        this.total_pago = total_pago;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
    
    
}
