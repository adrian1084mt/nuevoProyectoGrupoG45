package com.nuevo.proyecto.controller;

import com.nuevo.proyecto.model.Category;
import com.nuevo.proyecto.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins = "*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> list() {
        return (List<Category>) categoryService.findAll();
    }

    @PostMapping("/all")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Category> list2() {
        return (List<Category>) categoryService.findAll();
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category add(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Category category, @PathVariable Integer id) {
        try {
            Category existCategory = categoryService.findById(id).get();
            categoryService.save(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping("/update")
    public Category update(@RequestBody Category category) {
        return categoryService.save(category);
    }
//    @DeleteMapping("/{id}")
//    public boolean delete(@PathVariable Integer id) {
//        return categoryService.delete(id);
//    }






    @GetMapping("/{id}")
    public ResponseEntity<Category> get(@PathVariable Integer id) {
        try {
            Category category = categoryService.findById(id).get();
            return new ResponseEntity<Category>(category, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
        }
    }






    public CategoryController() {
    }
}
