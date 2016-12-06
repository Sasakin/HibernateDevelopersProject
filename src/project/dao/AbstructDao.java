package project.dao;

import java.util.List;


public interface AbstructDao {
    public void add(Object object);
    public void update(Object object);
    public void remove(int id);
    public Object getById(int id);
    public List<Object> getList();
}
