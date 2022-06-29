package com.vti.entity.converterenum;

import com.vti.entity.enumtype.DepartmentSize;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class DepartmentSizeConverter implements AttributeConverter<DepartmentSize, String> {


    @Override
    public String convertToDatabaseColumn(DepartmentSize departmentSize) {
        if (departmentSize == null) {
            return null;
        }
        return departmentSize.getDepartmentSize();
    }

    @Override
    public DepartmentSize convertToEntityAttribute(String sqlDepartmentSize) {
        if (sqlDepartmentSize == null) {
            return null;
        }
        return DepartmentSize.toEnum(sqlDepartmentSize);
    }
}
