package com.ecommerce.library.service;

import com.ecommerce.library.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    List<Category> findAll();
    Category save( Category category);
    Category getById(Long Id);
    Category update(Category category);
    void deleteById(Long id);
    void enabledById(Long id);
}
