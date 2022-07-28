package com.example.demo_boot.repository;


import com.example.demo_boot.model.Blogs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface IBlogRepo extends PagingAndSortingRepository<Blogs,Long> {
    Page<Blogs> findByTitleContaining(Pageable pageable, String title);
    Optional<Blogs> findByTitle(String title);

}
