package com.vti.entity.enumtype;

public enum DepartmentSize {
    SMALL("M"), MEDIUM("L"), LARGE("XL");

    private String departmentSize;

    private DepartmentSize(String departmentSize) {
        this.departmentSize = departmentSize;
    }

    public String getDepartmentSize() {
        return departmentSize;
    }

    public static DepartmentSize toEnum(String sqlDepartmentSize) {
        for (DepartmentSize item: DepartmentSize.values()) {
            if (item.getDepartmentSize().equals(sqlDepartmentSize)) {
                return item;
            }
        }
        return null;
    }
}
