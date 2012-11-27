/*
 * Historia de Usuario: Roles Test
 * Desarrollado: Carlos Ricaldi
 */
package proyectopoo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({proyectopoo.HistoriaVentaTest.class, proyectopoo.ClienteTest.class, proyectopoo.ComprasTest.class, proyectopoo.AltaProspectoTest.class, proyectopoo.AdminUsuarioTest.class, proyectopoo.ProspectoTest.class, proyectopoo.ClientesTest.class})
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
