package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao{
    public void add(Product product) {
        //sadece database erişim kodları buraya yazılır..SQL bilmek gerekir.
        System.out.println("JDBC ile veritabanına eklendi.");
    }
}



