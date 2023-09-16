package cgg.sbpingboot.restapi.springbootrestapidemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.sbpingboot.restapi.springbootrestapidemo.entities.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{
    
}
