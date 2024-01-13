package com.example.appliances.repository;

import com.example.appliances.entity.ProductCategory;
import com.example.appliances.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {
}