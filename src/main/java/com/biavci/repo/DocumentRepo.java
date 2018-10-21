/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biavci.repo;

import com.biavci.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author bduman
 */
public interface DocumentRepo extends JpaRepository<Document, Long>{
    
}
