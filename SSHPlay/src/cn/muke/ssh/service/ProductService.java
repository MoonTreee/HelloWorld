package cn.muke.ssh.service;

import cn.muke.ssh.dao.ProductDao;
import cn.muke.ssh.domain.Product;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Tree on 2017/2/23.
 */
@Transactional
public class ProductService {
    //业务层注入DAO的类
    private ProductDao productDao;
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }


    public void save(Product product) {
        System.out.println("Service中的save方法执行了...");
        productDao.save(product);
    }
    public void delete(Product product) {
        System.out.println("Service中的delete方法执行了...");
        productDao.delete(product);
    }
}
