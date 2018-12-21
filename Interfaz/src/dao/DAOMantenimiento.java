package dao;

import java.util.ArrayList;

public interface DAOMantenimiento {
    
    public void guardar() throws Exception;
    public void actualizar() throws Exception;
    public void eliminar() throws Exception;
    public ArrayList listar() throws Exception;
    
}
