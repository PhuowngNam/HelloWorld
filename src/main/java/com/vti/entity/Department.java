package com.vti.entity;

import com.vti.entity.converterenum.DepartmentSizeConverter;
import com.vti.entity.enumtype.DepartmentLevel;
import com.vti.entity.enumtype.DepartmentSize;
import com.vti.entity.enumtype.DepartmentStatus;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Converter;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department implements Serializable {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private DepartmentStatus status;

    @Column(name = "level")
    @Enumerated(EnumType.STRING)
    private DepartmentLevel level;

    @Column(name = "size")
    @Convert(converter = DepartmentSizeConverter.class)
    private DepartmentSize size;

    public Department() { }

    public Department(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DepartmentStatus getStatus() {
        return status;
    }

    public void setStatus(DepartmentStatus status) {
        this.status = status;
    }

    public DepartmentLevel getLevel() {
        return level;
    }

    public void setLevel(DepartmentLevel level) {
        this.level = level;
    }

    public DepartmentSize getSize() {
        return size;
    }

    public void setSize(DepartmentSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Department{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", status=" + status +
            ", level=" + level +
            ", size=" + size +
            '}';
    }
}
