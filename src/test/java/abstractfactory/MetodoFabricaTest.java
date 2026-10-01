package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MetodoFabricaTest {

    @Test
    public void testSingleton() {
        MetodoFabrica a = MetodoFabrica.getInstance();
        MetodoFabrica b = MetodoFabrica.getInstance();
        assertSame(a, b);
    }

    @Test
    public void testFabricaPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        assertTrue(fabrica instanceof FabricaPF);
    }

    @Test
    public void testFabricaPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        assertTrue(fabrica instanceof FabricaPJ);
    }

    @Test
    public void testTipoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            MetodoFabrica.getInstance().obterFabrica("Foguete");
        });
    }
}
