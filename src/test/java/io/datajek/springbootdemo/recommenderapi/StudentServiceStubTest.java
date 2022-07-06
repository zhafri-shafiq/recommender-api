package io.datajek.springbootdemo.recommenderapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceStubTest {

    @Test
    void testfindTotal() {
        StudentService studentService = new StudentService(new StudentDaoStub());
        int total = studentService.findTotal();
        assertEquals(40, total);
    }
}