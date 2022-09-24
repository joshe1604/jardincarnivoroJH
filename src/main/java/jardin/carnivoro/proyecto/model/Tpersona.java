/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jardin.carnivoro.proyecto.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Joshe
 */
@Entity
@Table(name="Tpersona")
public class Tpersona {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "cpersona", nullable = false)
    private Long cpersona;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "fnacimiento")
    private Date fnacimiento;
    
    @Column(name = "identificacion", nullable = false)
    private String identificacion;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "correo")
    private String correo;
    
    
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
     * @return the cpersona
     */
    public Long getCpersona() {
        return cpersona;
    }

    /**
     * @param cpersona the cpersona to set
     */
    public void setCpersona(Long cpersona) {
        this.cpersona = cpersona;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the fnacimiento
     */
    public Date getFnacimiento() {
        return fnacimiento;
    }

    /**
     * @param fnacimiento the fnacimiento to set
     */
    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }

    /**
     * @return the identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion the identificacion to set
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
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
