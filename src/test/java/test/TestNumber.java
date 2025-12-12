/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import poly.com.ui.Numbers;


/**
 *
 * @author Hp
 */
public class TestNumber {
    
    private final Numbers nb = new Numbers();
    
    @Test
    public void testSo3(){
        Numbers demo1 = new Numbers();
        boolean result = demo1.kiemTraSoDuong(3);
        assertFalse(result);
    }
    @Test
    public void testSo6(){
        Numbers demo2 = new Numbers();
        boolean result = demo2.kiemTraSoDuong(6);
        assertTrue(result);
    }
    
    
}
