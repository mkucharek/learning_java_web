package pl.krzysh.exercises.mvc.springapp.service;

import java.io.Serializable;
import java.util.List;

import pl.krzysh.exercises.mvc.springapp.domain.Product;

public interface ProductManager extends Serializable{

    public void increasePrice(int percentage);
    
    public List<Product> getProducts();
    
}