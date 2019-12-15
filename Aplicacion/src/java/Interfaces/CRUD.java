package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Christian Quiroz
 * @param <Generic>
 */
public interface CRUD<Generic> {

    public boolean create(Generic obj);

    public Generic getById(Generic obj);//read

    public ArrayList<Generic> getAll();//read

    public boolean update(Generic obj);

    public boolean delete(Generic obj);

}
