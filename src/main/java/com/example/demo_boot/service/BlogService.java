package com.example.demo_boot.service;


import com.example.demo_boot.model.Blogs;
import com.example.demo_boot.repository.IBlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class BlogService {
    @Autowired
    IBlogRepo iBlogRepo;

    public Page<Blogs> getAll(Pageable pageable) {
        return  iBlogRepo.findAll(pageable);
    }
    public Page<Blogs> getAllByTitle(Pageable pageable, String title) {
        return  iBlogRepo.findByTitleContaining(pageable,title);
    }

    public void save(Blogs blogs) {
        iBlogRepo.save(blogs);
    }

    public void delete(long id) {
        iBlogRepo.deleteById(id);
    }

    public Optional<Blogs> findById(long id) {
        return iBlogRepo.findById(id);
    }

    public Optional<Blogs> findByTitle(String title) {
        return iBlogRepo.findByTitle(title);
    }

}
