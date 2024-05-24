package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        Department object = new Department(1, "book");

        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, object);

        SellerDao sellerDao = DaoFactory.createSellerDao();
        
        System.out.println(seller);
    }
}
