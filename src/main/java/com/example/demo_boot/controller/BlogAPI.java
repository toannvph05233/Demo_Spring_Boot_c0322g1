package com.example.demo_boot.controller;

import com.example.demo_boot.model.Blogs;
import com.example.demo_boot.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blogs")
public class BlogAPI {
    @Autowired
    BlogService blogService;

    @GetMapping
    public Page<Blogs> getPage() {
        return blogService.getAll(PageRequest.of(1, 3));
    }

    @PostMapping
    public Blogs save(@RequestBody Blogs blogs) {
        blogService.save(blogs);
        return blogs;
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable long id) {
        blogService.delete(id);
        return "ok";
    }

    @PutMapping
    public Blogs update(@RequestBody Blogs blogs) {
        blogService.save(blogs);
        return blogs;
    }
}
