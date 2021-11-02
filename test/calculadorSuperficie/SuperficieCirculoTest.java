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
    public void testSupCircunferencia1() {
        System.out.println("supCircunferencia para 0");
        double r = 0.0;
        SuperficieCirculo instance = new SuperficieCirculo();
        double expResult = 0.0;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result,0.0);  
    }
    
    @Test
    public void testSupCircunferencia2() {
        System.out.println("supCircunferencia para números <0");
        double r = -10;
        SuperficieCirculo instance = new SuperficieCirculo();
        double expResult = 0;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result,0.0);  
    }
    
    @Test
    public void testSupCircunferencia3() {
        System.out.println("supCircunferencia para números >0");
        double r = 10;
        SuperficieCirculo instance = new SuperficieCirculo();
        double expResult = 314.1592653589793;
        double result = instance.supCircunferencia(r);
        assertEquals(expResult, result,0.0);  
    }
    
}
