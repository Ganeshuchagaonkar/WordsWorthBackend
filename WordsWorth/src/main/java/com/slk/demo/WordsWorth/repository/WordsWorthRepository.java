package com.slk.demo.WordsWorth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slk.demo.WordsWorth.entity.Books;



public interface WordsWorthRepository extends JpaRepository<Books,Integer> {

}
