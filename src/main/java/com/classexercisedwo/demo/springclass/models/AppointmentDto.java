package com.classexercisedwo.demo.springclass.models;

public class AppointmentDto {
    private Long teacherId;
    private Long studentId;

    public AppointmentDto() {
    }

    public Long getTeacherId() {
        return teacherId;
    }

    public AppointmentDto(Long teacherId, Long studentId) {
        this.teacherId = teacherId;
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "AppointmentDto{" +
                "teacherId=" + teacherId +
                ", studentId=" + studentId +
                '}';
    }

    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

}
