/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorSuperficie;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristian
 */
public class SuperficieCirculoTest {
    
    public SuperficieCirculoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of supCircunferencia method, of class SuperficieCirculo.
     */
    @Test
    public void testSupCircunferencia() {
        System.out.println("supCircunferencia");
        double r = 0.0;
        SuperficieCirculo instance = new SuperficieCirculo();
        double expResult = 0.0;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
