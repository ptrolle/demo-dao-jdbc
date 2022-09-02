package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id); //consultar no banco de dados atraves de um ID, se existir vai retornar se nao retorna nulo
    List<Seller> findAll();
}
