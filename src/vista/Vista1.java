/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Operaciones;
import modelo.*;

/**
 *
 * @author polancou
 */
public class Vista1 {
    Operaciones oper;
    public Vista1(){
        oper=new Operaciones();
    }
    public int altaUsuario(String oro, String arma, int runas, int pociones,int lvl,String nombres, String apellidop, String apellidom, String username, String correo, String pass, int x, int y, int z, int w){
        Direccion direccion = new Direccion(x,y,z,w);
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