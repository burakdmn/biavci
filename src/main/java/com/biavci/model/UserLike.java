/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.biavci.model;

import com.biavci.base.model.BaseClass;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author bduman
 */
@Entity
public class UserLike extends BaseClass implements Serializable {

    @ManyToOne
    private Document document;
    private String like_type;

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getLike_type() {
        return like_type;
    }

    public void setLike_type(String like_type) {
        this.like_type = like_type;
    }

}
