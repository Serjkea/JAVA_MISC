package ru.skprojects.springbootproject.service;

import ru.skprojects.springbootproject.domain.Product;

import java.util.List;

public interface ProductService {

    void addProduct(Product product);
    void addProducts(List<Product> products);
    Product getProductById(Long id);
    Product getProductByName(String name);
    void deleteProductById(Long id);
    void deleteProductByName(String name);
    void deleteAllProducts();

}
