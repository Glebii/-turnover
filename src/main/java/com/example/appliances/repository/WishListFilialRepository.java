package com.example.appliances.repository;

import com.example.appliances.entity.WishListFilial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListFilialRepository extends JpaRepository<WishListFilial,Long> {
}
