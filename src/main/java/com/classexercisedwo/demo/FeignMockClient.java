package com.classexercisedwo.demo;

import com.classexercisedwo.demo.springclass.models.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name= "name",url="http://10.51.10.111:2000")
public interface FeignMockClient {

        @RequestMapping(method = RequestMethod.POST, value = "students")
        Student registerStudent(@RequestBody Student student );

        @RequestMapping(method = RequestMethod.GET, value = "/students")
        Student findById(@RequestParam(name ="studentNumber") String studentNumber);

        @RequestMapping(method = RequestMethod.POST, value = "/appointments")
        AppointmentDto bookAppointment(@RequestBody AppointmentDto appointmentDto);

        @RequestMapping(method = RequestMethod.PATCH, value = "/appointments/{id}")
        Appointment confirmAppointment(@PathVariable(name="id") Long id, @RequestParam (name ="studentId") Long studentId);

      @RequestMapping(method = RequestMethod.POST, value = "/companies/{companyId}/attachments")
      AttachmentDto bookAttachment(@PathVariable(name="companyId") Long companyId, @RequestParam (name ="studentId") Long studentId);

    }


