/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({proyectopoo.HistoriaVentaTest.class, proyectopoo.PersonasTest.class, proyectopoo.ComprasTest.class, proyectopoo.AltaProspectoTest.class, proyectopoo.AdminUsuarioTest.class, proyectopoo.ProspectoTest.class, proyectopoo.ClientesTest.class})
public class RolesTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
