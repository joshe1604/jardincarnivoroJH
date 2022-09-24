/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jardin.carnivoro.proyecto.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Joshe
 */
public class Tpersonadireccion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "spersonadireccion", nullable = false)
    private String spersonadireccion;
    
     
    @Column(name = "ctipodireccion", nullable = false)
    private String ctipodireccion; 
    
    @Column(name = "direccion")
    private String direccion; 
    
    
    @Column(name = "verificado")
    private String verificado; 
    
    @Column(name = "estado")
    private String estado; 
    
    
    @Column(name = "activo")
    private String activo;
    
    @Column(name = "cusuariocreacion")
    private String cusuariocreacion;
    
    @Column(name = "fcreacion")
    private Date fcreacion;
    
    @Column(name = "cusuariomodificacion")
    private String cusuariomodificacion;
    
    @Column(name = "fmodificacion")
    private Date fmodificacion;
    
    /**
     * @return the activo
     */
    public String getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(String activo) {
        this.activo = activo;
    }

    /**
     * @return the cusuariocreacion
     */
    public String getCusuariocreacion() {
        return cusuariocreacion;
    }

    /**
     * @param cusuariocreacion the cusuariocreacion to set
     */
    public void setCusuariocreacion(String cusuariocreacion) {
        this.cusuariocreacion = cusuariocreacion;
    }

    /**
     * @return the fcreacion
     */
    public Date getFcreacion() {
        return fcreacion;
    }

    /**
     * @param fcreacion the fcreacion to set
     */
    public void setFcreacion(Date fcreacion) {
        this.fcreacion = fcreacion;
    }

    /**
     * @return the cusuariomodificacion
     */
    public String getCusuariomodificacion() {
        return cusuariomodificacion;
    }

    /**
     * @param cusuariomodificacion the cusuariomodificacion to set
     */
    public void setCusuariomodificacion(String cusuariomodificacion) {
        this.cusuariomodificacion = cusuariomodificacion;
    }

    /**
     * @return the fmodificacion
     */
    public Date getFmodificacion() {
        return fmodificacion;
    }

    /**
     * @param fmodificacion the fmodificacion to set
     */
    public void setFmodificacion(Date fmodificacion) {
        this.fmodificacion = fmodificacion;
    }

    /**
     * @return the spersonadireccion
     */
    public String getSpersonadireccion() {
        return spersonadireccion;
    }

    /**
     * @param spersonadireccion the spersonadireccion to set
     */
    public void setSpersonadireccion(String spersonadireccion) {
        this.spersonadireccion = spersonadireccion;
    }

    /**
     * @return the ctipodireccion
     */
    public String getCtipodireccion() {
        return ctipodireccion;
    }

    /**
     * @param ctipodireccion the ctipodireccion to set
     */
    public void setCtipodireccion(String ctipodireccion) {
        this.ctipodireccion = ctipodireccion;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the verificado
     */
    public String getVerificado() {
        return verificado;
    }

    /**
     * @param verificado the verificado to set
     */
    public void setVerificado(String verificado) {
        this.verificado = verificado;
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
}
