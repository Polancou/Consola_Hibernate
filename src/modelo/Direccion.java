package modelo;
// Generated 15-mar-2018 20:38:17 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Direccion generated by hbm2java
 */
public class Direccion  implements java.io.Serializable {


     private Integer id;
     private int calle;
     private int no;
     private int ciudad;
     private int cp;
     private Set usuarios = new HashSet(0);

    public Direccion() {
    }

	
    public Direccion(int calle, int no, int ciudad, int cp) {
        this.calle = calle;
        this.no = no;
        this.ciudad = ciudad;
        this.cp = cp;
    }
    public Direccion(int calle, int no, int ciudad, int cp, Set usuarios) {
       this.calle = calle;
       this.no = no;
       this.ciudad = ciudad;
       this.cp = cp;
       this.usuarios = usuarios;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getCalle() {
        return this.calle;
    }
    
    public void setCalle(int calle) {
        this.calle = calle;
    }
    public int getNo() {
        return this.no;
    }
    
    public void setNo(int no) {
        this.no = no;
    }
    public int getCiudad() {
        return this.ciudad;
    }
    
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
    public int getCp() {
        return this.cp;
    }
    
    public void setCp(int cp) {
        this.cp = cp;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}

