package com.springboot.blog.springbootblogrestapi.service;

import com.springboot.blog.springbootblogrestapi.payload.CategoryDto;

import java.util.List;

public interface CategoryService {
    CategoryDto addCategory(CategoryDto categoryDto);
    CategoryDto getCategory(Long categoryId);
    List<CategoryDto>  getAllCategories();
    CategoryDto updateCategory(CategoryDto categoryDto, long categoryId);
    void deleteCategory(long categoryId);
}
