package org.example.business;

import org.example.entities.Product;
import org.example.core.logging.Logger;
import org.example.dataAccess.ProductDao;
import java.util.List;


public class ProductManager {
    private ProductDao productDao;
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = List.of(loggers);

    }

    public void add(Product product) throws Exception {
        //iş kuralları
        if(product.getUnitPrice()<10) {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }

        productDao.add(product);

        for (Logger logger: loggers){//[db,file]
            logger.log(product.getName());
        }

    }
}
