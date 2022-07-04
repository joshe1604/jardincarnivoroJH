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
    
    
    
}
