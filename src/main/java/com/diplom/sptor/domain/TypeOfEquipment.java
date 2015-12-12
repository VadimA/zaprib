package com.diplom.sptor.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 03.12.2015.
 */
@Entity
@Table(name = "toir.type_of_equipment")
public class TypeOfEquipment implements Serializable {

    @Id
    @Column(name = "equipment_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int type_of_equipment_id;
    private String type_of_equipment_name;
    private String description;


    public TypeOfEquipment() {}

    public TypeOfEquipment(String type_of_equipment_name, String description) {
        this.type_of_equipment_name = type_of_equipment_name;
        this.description = description;
    }

    public int getType_of_equipment_id() {
        return type_of_equipment_id;
    }

    public void setType_of_equipment_id(int type_of_equipment_id) {
        this.type_of_equipment_id = type_of_equipment_id;
    }

    public String getType_of_equipment_name() {
        return type_of_equipment_name;
    }

    public void setType_of_equipment_name(String type_of_equipment_name) {
        this.type_of_equipment_name = type_of_equipment_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TypeOfEquipment)) return false;

        TypeOfEquipment that = (TypeOfEquipment) o;

        if (getType_of_equipment_id() != that.getType_of_equipment_id()) return false;
        if (getType_of_equipment_name() != null ? !getType_of_equipment_name().equals(that.getType_of_equipment_name()) : that.getType_of_equipment_name() != null)
            return false;
        return !(getDescription() != null ? !getDescription().equals(that.getDescription()) : that.getDescription() != null);

    }

    @Override
    public int hashCode() {
        int result = getType_of_equipment_id();
        result = 31 * result + (getType_of_equipment_name() != null ? getType_of_equipment_name().hashCode() : 0);
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        return result;
    }
}