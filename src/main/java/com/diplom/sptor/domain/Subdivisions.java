package com.diplom.sptor.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 03.12.2015.
 */
@Entity
@Table(name = "toir.subdivisions")
@SequenceGenerator(name="seq", initialValue=4, allocationSize=100)
public class Subdivisions implements Serializable{

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    //@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    private int subdivision_id;

    private String subdivision_name;
    private String abbreviation;
    private String responsible;
    private String description;

    public Subdivisions(String subdivision_name, String abbreviation, String responsible, String description) {
        this.subdivision_name = subdivision_name;
        this.abbreviation = abbreviation;
        this.responsible = responsible;
        this.description = description;
    }

    public Subdivisions() {}

    public int getSubdivision_id() {
        return subdivision_id;
    }

    public void setSubdivision_id(int subdivision_id) {
        this.subdivision_id = subdivision_id;
    }

    public String getSubdivision_name() {
        return subdivision_name;
    }

    public void setSubdivision_name(String subdivision_name) {
        this.subdivision_name = subdivision_name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriptiontds) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subdivisions)) return false;

        Subdivisions that = (Subdivisions) o;

        if (getSubdivision_id() != that.getSubdivision_id()) return false;
        if (!getSubdivision_name().equals(that.getSubdivision_name())) return false;
        if (!getAbbreviation().equals(that.getAbbreviation())) return false;
        if (!getResponsible().equals(that.getResponsible())) return false;
        return !(getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null);

    }

    @Override
    public int hashCode() {
        int result = getSubdivision_id();
        result = 31 * result + getSubdivision_name().hashCode();
        result = 31 * result + getAbbreviation().hashCode();
        result = 31 * result + getResponsible().hashCode();
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}