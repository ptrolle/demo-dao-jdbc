package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args){

        /*Department obj = new Department(1, "Books");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);*/

        SellerDao sellerDao = DaoFactory.createSellerDao(); //desta forma meu programa nao conhece a implementacao apenas a interface
        System.out.println("==== TEST 1: seller findById ====");
        Seller seller = sellerDao.findById(3); //para procurar o vendedor com o id 3 no banco de dados

        System.out.println(seller);
    }
}
