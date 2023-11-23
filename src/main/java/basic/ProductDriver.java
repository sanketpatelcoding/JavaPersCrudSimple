package basic;




import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vinod");
		EntityManager em	=	emf.createEntityManager();
		
	//	ProductDriver pdr=new ProductDriver();
		
		//pdr.findProduct();
		//fin the product
	/*	Products  productobj=em.find(Products.class, 2);
		if(productobj !=null) {
			System.out.println(productobj);
			
		}else {
			System.out.println("not finding");
		}
		
		*/
		
		//adding product
	
		/*
		
		Products p4= new Products(4,"Product4",445,745);
		em.getTransaction().begin();
		em.persist(p4);
		em.getTransaction().commit();
		em.close();
		
		*/
		
		//to remove a product from id
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the ID of product that you want to remove:");
		int id = sc.nextInt();
		em.getTransaction().begin();
		
		// first we find the product is present or not
		Products product = em.find(Products.class, id);
		if(product != null) {
			em.remove(product);
			System.out.println("removed the product with id :"+id);
		}else {
			System.out.println("dta not aailable dor the id");
		}
		em.getTransaction().commit();
		em.close();  */
		
		//update the product price
		                 /*
		                  * 1 find the product
		                  * get the id ,with the id get the object,use methods to update*/

		          System.out.println("enter thre id of product want to  update");
		          
				Scanner sc1=new Scanner(System.in);
		          // int id1=  sc1.nextInt();
		           Products  productobj=em.find(Products.class, sc1.nextInt());
		          if(productobj!=null) {
		        	  productobj.setPrice(2023);
						productobj.setProductName("ProductUpdated");
						productobj.setQuantity(11);
						em.getTransaction().begin();
						em.getTransaction().commit();
		        	  em.merge(productobj);
		          }else {
					System.out.println("prduct object is null for this id");
					
				}
	}  
	
	
	
	
		
	

}
