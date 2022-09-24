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
public class Tipousuario {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "ctipousuario", nullable = false)
    private Long ctipousuario;
    
    @Column(name = "descripcion")
    private String descripcion;
    
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
     * @return the ctipousuario
     */
    public Long getCtipousuario() {
        return ctipousuario;
    }

    /**
     * @param ctipousuario the ctipousuario to set
     */
    public void setCtipousuario(Long ctipousuario) {
        this.ctipousuario = ctipousuario;
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
}
