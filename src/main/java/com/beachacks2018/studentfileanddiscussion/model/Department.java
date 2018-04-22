/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beachacks2018.studentfileanddiscussion.model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

/**
 *
 * @author markl
 */
@Entity
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String deptName;
    
    @ManyToOne
    private School school;
    
    @OneToMany()
    private Collection<Class> classes ;
    
    /**
     * Get Department Name
     * @return 
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Set department name
     * @param deptName 
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    /**
     * Get ID of the department;
     * @return 
     */
    public Long getId() {
        return id;
    }

    /**
     * Set ID of the department
     * @param id 
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.deptName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Department other = (Department) obj;
        if (!Objects.equals(this.deptName, other.deptName)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Department{" + "id=" + id + ", deptName=" + deptName + '}';
    }


    
    
}
