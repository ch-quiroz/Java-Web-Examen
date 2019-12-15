package DAO;

import DataBase.Conexion;
import Interfaces.CRUD;
import Models.Empresa;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian Quiroz
 */
public class DAOEmpresa implements CRUD<Empresa> {

    private ResultSet rs;
    private PreparedStatement ps;
    private Conexion conn = Conexion.InstanciaConn();

    private static String sql_insert = "insert into empresa(id_empresa,rut,nombre,direccion,comprador) values(?,?,?,?,?,)";
    private static String sql_update = "uptdate cliente set rut = ?, nombre = ?,direccion = ?,comprador = ? where id_empresa = ? ";
    private static String sql_selectAll = "select * from empresa";
    private static String sql_selectEmpresa = "select * from empresa where id_empresa = ?";

    @Override
    public boolean create(Empresa obj) {

        try {

            ps = conn.getConn().prepareStatement(sql_insert);
            ps.setString(2, obj.getRutEmpresa());
            ps.setString(2, obj.getNombreEmpresa());
            ps.setString(4, obj.getDireccion());
            ps.setString(5, obj.getComprador());

            if (ps.executeUpdate() > 0) {
                conn.Cerrar();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, "No se ha podido insertar la empresa en la base de datos", ex);
            return false;
        }

        return false;

    }

    @Override
    public Empresa getById(Empresa obj) {

        try {
            Empresa emp = new Empresa();
            ps = conn.getConn().prepareStatement(sql_selectEmpresa);
            ps.setInt(1, obj.getId_empresa());
            rs = ps.executeQuery();

            while (rs.next()) {
                emp.setId_empresa(rs.getInt("id_empresa"));
                emp.setRutEmpresa(rs.getString("rut"));
                emp.setNombreEmpresa(rs.getString("nombre"));
                emp.setDireccion(rs.getString("direccion"));
                emp.setComprador(rs.getString("comprador"));
            }

            conn.Cerrar();
            return emp;
        } catch (SQLException ex) {

            Logger.getLogger(DAOEmpresa.class.getName()).log(Level.SEVERE, "Error al encontrar la empresa con id" + obj.getId_empresa(), ex);
            return null;

        }
    }

    @Override
    public ArrayList<Empresa> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Empresa o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Empresa o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
