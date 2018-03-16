/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import modelo.*;

/**
 *
 * @author polancou
 */
public class Operaciones {
    public int altaUsuarios(Usuario user){
        int id =0;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        id=user.getId();
        tx.commit();
        session.close();
        System.out.println("Insertado Correctamente");
        return id;
    }
    public int addNombre(Nombre nombre){
        int id=0;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(nombre);
        id=nombre.getId();
        tx.commit();
        session.close();
        return id;
    }
    public int addDireccion(Direccion direccion){
        int id=0;
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(direccion);
        tx.commit();
        id=direccion.getId();
        session.close();
       return id;
    }
    public void addInventario(Inventario inventario){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(inventario);
        tx.commit();
        session.close();
        System.out.println("Insertado Correctamente");
    }
    public void addInventarioUsuario(InventarioUsuario invUser){
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(invUser);
        tx.commit();
        session.close();
        System.out.println("Insertado Correctamente");
    }
}
