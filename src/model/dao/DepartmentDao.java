package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id); //consultar no banco de dados atraves de um ID, se existir vai retornar se nao retorna nulo
    List<Department> findAll();
}
