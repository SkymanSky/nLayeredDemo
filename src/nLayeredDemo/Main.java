package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.dataAccess.concretes.abcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: Spring IoC ile cozulecek.
		ProductService productService = new ProductManager(new abcProductDao(), new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		

	}

}
