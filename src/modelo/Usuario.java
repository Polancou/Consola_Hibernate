package modelo;
// Generated 15-mar-2018 20:38:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer id;
     private Direccion direccion;
     private Nombre nombre;
     private String username;
     private String correo;
     private String pass;
     private Set inventarioUsuarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Direccion direccion, Nombre nombre, String username, String correo, String pass) {
        this.direccion = direccion;
        this.nombre = nombre;
        this.username = username;
        this.correo = correo;
        this.pass = pass;
    }
    public Usuario(Direccion direccion, Nombre nombre, String username, String correo, String pass, Set inventarioUsuarios) {
       this.direccion = direccion;
       this.nombre = nombre;
       this.username = username;
       this.correo = correo;
       this.pass = pass;
       this.inventarioUsuarios = inventarioUsuarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    public Nombre getNombre() {
        return this.nombre;
    }
    
    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public Set getInventarioUsuarios() {
        return this.inventarioUsuarios;
    }
    
    public void setInventarioUsuarios(Set inventarioUsuarios) {
        this.inventarioUsuarios = inventarioUsuarios;
    }




}


