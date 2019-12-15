/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DataBase.Conexion;
import Interfaces.CRUD;
import Models.Carretera;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tukin
 */
public class DAOCarretera implements CRUD<Carretera> {

    private static String sql_selectAll = "select * from carretera";
    private static Conexion conn = Conexion.InstanciaConn();
    private ResultSet rs;

    @Override
    public boolean create(Carretera obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Carretera getById(Carretera obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Carretera> getAll() {

        ArrayList<Carretera> carreteras = new ArrayList<>();
        PreparedStatement ps;

        try {

            ps = conn.getConn().prepareStatement(sql_selectAll);
            rs = ps.executeQuery();

            while (rs.next()) {
                carreteras.add(new Carretera(rs.getInt("id_carretera"), rs.getString("nombre"), rs.getInt("precio")));
            }
            conn.Cerrar();

            return carreteras;

        } catch (SQLException ex) {
            Logger.getLogger(DAOCarretera.class.getName()).log(Level.SEVERE, "Error al listar carreteras", ex);
            return null;
        }
    }

    @Override
    public boolean update(Carretera obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(Carretera obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
