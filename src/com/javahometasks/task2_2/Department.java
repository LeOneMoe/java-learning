package com.javahometasks.task2_2;

public class Department {
    public int processTime;
    public Department[] childDepartment;

    public Department(int processTime, Department[] childDepartment) {
        this.processTime = processTime;
        this.childDepartment = childDepartment;
    }

    public int totalProcessTime() {
        int minProcessTime = 0;

        for (Department childDepartment: this.childDepartment) {
            int childProcessTime = childDepartment.totalProcessTime();
            if (minProcessTime < childProcessTime) minProcessTime = childProcessTime;
        }

        return this.processTime + minProcessTime;
    }
}
