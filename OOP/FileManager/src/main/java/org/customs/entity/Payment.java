package org.customs.entity;

public class Payment {
    private	boolean sum;
    private	String courseType;

    public Payment() {
    }

    public Payment(boolean sum, String courseType) {
        this.sum = sum;
        this.courseType = courseType;
    }

    public boolean isSum() {
        return sum;
    }

    public void setSum(boolean sum) {
        this.sum = sum;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
}
