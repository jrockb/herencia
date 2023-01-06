package domain;

import java.util.Date;

/**
 *
 * @author jcd
 */
public class Cliente extends Persona{
    
    private static int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    
    public Cliente(Date fechaRegistro, boolean vip, String nombre, 
            char genero, int edad, String direccion){
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        idCliente = ++Cliente.idCliente;
    }

    public static int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", vip=").append(vip);
        sb.append(", fecha=").append(fechaRegistro);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
