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
public class Tplanta {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "cplanta", nullable = false)
    private Long cplanta;
    
    @Column(name = "nombreoficial")
    private String nombreoficial;
    
    @Column(name = "nombrealterno")
    private String nombrealterno;
    
    @Column(name = "nombresecundario")
    private String nombresecundario;
        
    @Column(name = "alias")
    private String alias;
    
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
     * @return the cplanta
     */
    public Long getCplanta() {
        return cplanta;
    }

    /**
     * @param cplanta the cplanta to set
     */
    public void setCplanta(Long cplanta) {
        this.cplanta = cplanta;
    }

    /**
     * @return the nombreoficial
     */
    public String getNombreoficial() {
        return nombreoficial;
    }

    /**
     * @param nombreoficial the nombreoficial to set
     */
    public void setNombreoficial(String nombreoficial) {
        this.nombreoficial = nombreoficial;
    }

    /**
     * @return the nombrealterno
     */
    public String getNombrealterno() {
        return nombrealterno;
    }

    /**
     * @param nombrealterno the nombrealterno to set
     */
    public void setNombrealterno(String nombrealterno) {
        this.nombrealterno = nombrealterno;
    }

    /**
     * @return the nombresecundario
     */
    public String getNombresecundario() {
        return nombresecundario;
    }

    /**
     * @param nombresecundario the nombresecundario to set
     */
    public void setNombresecundario(String nombresecundario) {
        this.nombresecundario = nombresecundario;
    }

    /**
     * @return the alias
     */
    public String getAlias() {
        return alias;
    }

    /**
     * @param alias the alias to set
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
