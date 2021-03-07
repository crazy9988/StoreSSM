package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import pojo.Product;

@Repository
public interface ProductDao {
	//根据id获取商品（映射fiveImage/sixImage）
	public Product getProductById(int id);
	//根据name模糊查询商品（映射fiveImage/sixImage）
	public List<Product> getProductByName(String name);
	//根据id修改库存和月销量（生成订单时用到）
	public void updateStockAndSaleCountById(@Param("id") int id,@Param("number") int number);
	//根据id修改库存（用于入货到100）
	public void updateStockById(int id);
	//根据categoryId查询所有的商品
	public List<Product> getAllProductByCategoryIdForAdmin(int categoryId);
	//增加一个商品
	public void addProductForAdmin(Product product);
	//根据id修改商品
	public void updateProductForAdmin(Product product);
	//根据id删除商品
	public void deleteProductByIdForAdmin(int id);
}
