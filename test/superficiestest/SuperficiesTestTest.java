/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superficiestest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author rfernandezgonzalez
 */
public class SuperficiesTestTest {

    public SuperficiesTestTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class SuperficiesTest.
     */
    @Test
    public void testCalcular() {
        System.out.println("calcular");
        Modelo contenedor = new Modelo(0, 25, 5, 0, 0, 0, 0, 0, 0, 0);
        float expResult = 25.0F;
        float result = Controlador.calcular(contenedor);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

}
