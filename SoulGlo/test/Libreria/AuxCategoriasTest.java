/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Informatica
 */
public class AuxCategoriasTest {
    
    public AuxCategoriasTest() {
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
     * Test of Agregar method, of class AuxCategorias.
     */
    @Test
    public void testAgregar_Categoria() {
        System.out.println("Agregar");
        Categoria Nueva = null;
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Agregar(Nueva);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class AuxCategorias.
     */
    @Test
    public void testAgregar_3args() {
        System.out.println("Agregar");
        int idcat = 4;
        String nom = "autosymezcladores";
        String desc = "ferrari";
        AuxCategorias instance = new AuxCategorias();
        int expResult = 5;
        int result = instance.Agregar(idcat, nom, desc);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Eliminar method, of class AuxCategorias.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        int idCat = 0;
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Eliminar(idCat);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_Categoria() {
        System.out.println("Modificar");
        Categoria CatModificada = null;
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Modificar(CatModificada);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of Modificar method, of class AuxCategorias.
     */
    @Test
    public void testModificar_3args() {
        System.out.println("Modificar");
        int idCategoria = 1;
        String nuevoNombre = "autos";
        String nuevaDescripcion = "mazda";
        AuxCategorias instance = new AuxCategorias();
        int expResult = 0;
        int result = instance.Modificar(idCategoria, nuevoNombre, nuevaDescripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
