package io.datajek.springbootdemo.recommenderapi;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;

//@ExtendWith(MockitoExtension.class)
class StudentServiceMockitoAnnotationsTest {

//    @Mock
    StudentDao studentDaoMock;

//    @InjectMocks
    StudentService studentService;

    @Test
    void testfindTotal() {
//        when(studentDaoMock.getMarks()).thenReturn(new int[] {15,20,5});

        int total = studentService.findTotal();
        assertEquals(40, total);
    }

    @Test
    void testfindTotal_EmptyArray() {
//        when(studentDaoMock.getMarks()).thenReturn(new int[] {});

        int total = studentService.findTotal();
        assertEquals(0, total);
    }
}