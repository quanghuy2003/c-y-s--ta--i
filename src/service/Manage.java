package service;

public interface Manage <T>{
    void create(T t);
    void delete(String name);
    void update(T t, String name);
    void findByName(String name);

}
