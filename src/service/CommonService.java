package service;

import java.util.List;

public interface CommonService<T> { //CRUD

    List<T> getAll();
    T getById(int id);
    void add(T object);
    void delete(int id);
    void update(int id, T object);
}
