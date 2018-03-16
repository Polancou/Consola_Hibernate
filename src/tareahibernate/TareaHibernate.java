/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareahibernate;

import vista.Vista1;



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
        String a,b,c;
        a="asda";
        b="poi";
        c="jkkl";
        Vista1 vista = new Vista1();
        int v = vista.altaUsuario(c, a, 0, 0, 0, b, a, a, a, c, a, 0, 0, 0, 0);
        System.out.println(v);
        System.exit(0);
    }
    
    
}
