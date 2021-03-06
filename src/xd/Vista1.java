/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xd;

import pojos.Usuario;
import pojos.Nombre;
import pojos.Direccion;
import pojos.InventarioUsuario;
import pojos.Inventario;
import controlador.Operaciones;

/**
 *
 * @author polancou
 */
public class Vista1 {
    Operaciones oper;
    public Vista1(){
        oper=new Operaciones();
    }
    public int altaUsuario(String oro, String arma, int runas, int pociones,int lvl,String nombres, String apellidop, String apellidom, String username, String correo, String pass, int calle, int no, int ciudad, int cp){
        Direccion direccion = new Direccion(calle,no,ciudad,cp);
        oper.addDireccion(direccion);
        
        Nombre nombre = new Nombre(nombres,apellidop, apellidom);
        oper.addNombre(nombre);
        
        Usuario usuario = new Usuario(direccion,nombre, username, correo, pass);
        int id = oper.altaUsuarios(usuario);
        
        
        Inventario inventario = new Inventario(oro,arma,runas,pociones);
        oper.addInventario(inventario);
        
        InventarioUsuario invUsr= new InventarioUsuario(inventario,usuario,lvl);
        oper.addInventarioUsuario(invUsr);
        return id;
    }
    
    
}