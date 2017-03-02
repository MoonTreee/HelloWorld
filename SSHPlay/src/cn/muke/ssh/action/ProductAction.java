package cn.muke.ssh.action;

import cn.muke.ssh.domain.Product;
import cn.muke.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by Tree on 2017/2/23.
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{
   //模型驱动使用的类
    private   Product product = new Product();
    @Override
    public Product getModel() {
        return product;
    }

    //整合按名称注入的类
    private ProductService productService;
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    //保存商品的执行方法：save
    public void save(){
        System.out.println("Action中的save方法执行了...");
        productService.save(product);
    }




}
