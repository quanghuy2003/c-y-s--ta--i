package service;

public interface General <T>{
    void add(T t);

    void delete(String name);

    void update(String name, String newName);

    void display();

   int findByName(String name);

//   void find(String name);
}
