/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareahibernate;

import java.util.Scanner;
import xd.Vista1;



/**
 *
 * @author polancou
 */
public class TareaHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        String nombres, apellidop, apellidom, username, correo, pass, oro, arma;
        int lvl = 0,calle=0,no=0,ciudad=0,cp=0,runas=0,pociones=0;
        System.out.println("Cuál es tu nombre?");
        nombres = read.next();
        System.out.println("Cuál es tu apellido paterno?");
        apellidop = read.next();
        System.out.println("Cuál es tu apellido materno?");
        apellidom = read.next();
        System.out.println("Nombre de usuario:");
        username = read.next();
        System.out.println("Correo electrónico:");
        correo = read.next();
        System.out.println("Contraseña:");
        pass = read.next();
        System.out.println("Dinero:");
        oro = read.next();
        System.out.println("Espada:");
        arma = read.next();
        System.out.println("Nivel:");
        lvl = read.nextInt();
        System.out.println("Ciudad:");
        ciudad = read.nextInt();
        System.out.println("Calle:");
        calle = read.nextInt();
        System.out.println("Numero:");
        no = read.nextInt();
        System.out.println("HP:");
        cp=read.nextInt();
        System.out.println("Runas:");
        runas = read.nextInt();
        System.out.println("Pociones:");
        pociones = read.nextInt();
        Vista1 vista = new Vista1();
        int v = vista.altaUsuario(oro, arma, runas, pociones, lvl, nombres, apellidop, apellidom, username, correo, pass, calle, no, ciudad, cp);
        System.out.println("Registrado, eres "+username+" tu nivel es "+lvl+" y tu ID es "+v);
        System.exit(0);
    }
    
    
}
