package cgg.sbpingboot.restapi.springbootrestapidemo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String fname;
    private String lname;
    private String lang;

    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;
    
}
