package com.fisys.expensor.model;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table (name="CATEGORY")
public class Category extends IdentityEntityBase {

    private Type type;
    private String name;

    public Category(){}

    public Category(String name, Type type){
        this.name = name;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
