package com.classexercisedwo.demo.springclass;

import com.classexercisedwo.demo.FeignMockClient;
import com.classexercisedwo.demo.springclass.models.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestingMock implements CommandLineRunner {

    private final FeignMockClient feignMockClient;


    public TestingMock(FeignMockClient feignMockClient) {
        this.feignMockClient = feignMockClient;
    }


    @Override
    public void run(String... args) throws Exception {

        //Register a student
       Student student = new Student ("094567", "Claudine");
        student = feignMockClient.registerStudent(student);
        System.out.println("New student registered: " + student.toString());

        //Request AttachmentDto
        AttachmentDto attachment = new AttachmentDto();
        Company company = new Company();
        //feignMockClient.bookAttachment(attachment.getCompanyId(), attachment.getStudentId());
      System.out.println("Attachment booked ");
        feignMockClient.bookAttachment(5l, 19l);
































//        //Listing Registered Student
//        student = feignMockClient.findById(student.getStudentNumber());
//        System.err.println(student.toString());
//
//        // Creating an Appointment
//
////    AppointmentDto appointmentDto = feignMockClient.bookAppointment(new AppointmentDto (long)1, student.getId());
////     System.out.println("Student: " + student.getId() + "has an appointment with lecture: " + appointmentDto.getTeacherId());
//
//        Teacher teacher = new Teacher();
//        AppointmentDto appointmentDto = new AppointmentDto();
//        teacher.setId((long)3);
//        appointmentDto.setStudentId(student.getId());
//        appointmentDto.setTeacherId(teacher.getId());
//        feignMockClient.bookAppointment(appointmentDto);
//        System.out.println("Student: " + appointmentDto.getStudentId() + " has an appointment with Lecturer: " + appointmentDto.getTeacherId());
//
//
//        //Confirm Appointment
//        Appointment appointment= new Appointment(student,teacher);
////       Appointment appointment = feignMockClient.confirmAppointment(new Appointment appointment.getId(),appointmentDto.getStudentId());
////        System.out.println("Appointment: " + appointment.getId() + "has been confirmed.");
//        student.setId(appointmentDto.getStudentId());
//        appointment.setId((long)8);
//        feignMockClient.confirmAppointment(appointment.getId(), appointmentDto.getStudentId());
//        System.out.println("Appoint: "+ appointment.getId() + "for " + appointment.getStudent().toString() + "and " + appointment.getTeacher().toString() + "has been confirmed");
    }
}
