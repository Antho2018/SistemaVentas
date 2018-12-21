/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import modelo.ModeloEmpleado;
import vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Controlador implements ActionListener {

    private ModeloEmpleado m;
    private VEmpleados v;

    public Controlador(ModeloEmpleado m, VEmpleados v) {
        this.m = m;
        this.v = v;
        this.v.btnRegistrarEmp.addActionListener(this);
    }

    /*Metodo para iniciar la interfaz*/
    public void iniciar() {
        v.setTitle("MVC Primer ejercicio");
        v.pack();
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
        v.setVisible(true);
        m.cargarMetodosEmpleados();
    }

    public void actionPerformed(ActionEvent evt) {
        if (v.btnRegistrarEmp == evt.getSource()) {
            try {
                m.guardar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error " + e);
            }
        }
    }

}
