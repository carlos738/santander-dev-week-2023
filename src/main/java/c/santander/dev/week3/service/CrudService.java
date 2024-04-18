package c.santander.dev.week3.service;



import org.yaml.snakeyaml.events.Event;

import java.util.List;

public interface CrudService<ID, T> {
    List<T> findAll();
    T findById(Event.ID id);
    T create(T entity);
    T update(Event.ID id, T entity);
    void delete(Event.ID id);
}

