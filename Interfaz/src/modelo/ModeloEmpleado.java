package modelo;

import dao.Conexion;
import dao.DAOMantenimiento;
import bean.Empleado;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import controlador.Controlador;
import java.sql.Date;
import javax.swing.JOptionPane;
import vista.VEmpleados;

public class ModeloEmpleado extends Conexion implements DAOMantenimiento {

    VEmpleados ve;
    Controlador c;
    DefaultTableModel modelo;

    public void cargarMetodosEmpleados() {
        modelarTabla();
    }

    public void modelarTabla() {
        modelo = (DefaultTableModel) ve.tblEmpleado.getModel();
    }

    @Override
    public void guardar() throws Exception {
        try {
            Empleado obj = new Empleado(nombreR(), cargoR(), fechaIngresoR(), dniR(), usuarioR(), claveR(), sexoR());
            this.conectarBD();
            PreparedStatement st = this.conexion.prepareStatement("insert into Empleado(NOMBRE,CARGO,FECHA_INGRESO,DNI,USUARIO,CONTRASENIA,SEXO) "
                    + "values(?,?,?,?,?,?,?)");
            st.setString(1, obj.getNombre());
            st.setString(2, obj.getCargo());
            st.setDate(3, obj.getFechaIngreso());
            st.setString(4, obj.getDni());
            st.setString(5, obj.getUsuario());
            st.setString(6, obj.getClave());
            st.setString(7, obj.getSexo());
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Datos Registrados en SQL SERVER");
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectarBD();
        }
        
    }

    @Override
    public void actualizar() throws Exception {
        try {            
            this.conectarBD();
            PreparedStatement st = this.conexion.prepareStatement("update Empleado set NOMBRE = ? where CODIGO = ?");
            JOptionPane.showMessageDialog(null, "Datos Registrados en SQL SERVER");
        } catch (Exception e) {
            throw e;
        } finally {
            this.desconectarBD();
        }
    }

    @Override
    public void eliminar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList listar() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String nombreR() {
        return ve.txtNombreREmp.getText();
    }

    private String cargoR() {
        return (String)ve.cboCargoREmp.getSelectedItem();
    }

    private static Date fechaIngresoR() {
        java.util.Date jca;
        jca = VEmpleados.jcFeIngREmp.getDate();
        java.sql.Date fecha = new java.sql.Date(jca.getTime());
        return fecha;
    }
    
    private String dniR() {
        return ve.txtDniREmp.getText();
    }

    private String usuarioR() {
        return ve.txtUsuarioREmp.getText();
    }

    private String claveR() {
        return ve.txtContraseniaREmp.getText();
    }

    private String sexoR() {
        String sexo = "";
        switch(ve.cboSexoREmp.getSelectedIndex()){
            case 1: sexo = "M";break;
            case 2: sexo = "F";break;
            default: JOptionPane.showMessageDialog(null, "Elija un sexo.");break;
        }
        return sexo;
    }

}
