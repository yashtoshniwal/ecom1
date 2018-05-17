/**
 * 
 */
package dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import entity.Product;

/**
 * @author Yash
 *
 */

@RepositoryRestResource
public interface ProductRepo extends CrudRepository<Product, Integer> {	

}
