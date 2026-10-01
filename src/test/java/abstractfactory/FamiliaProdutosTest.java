package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FamiliaProdutosTest {

    @Test
    public void testProdutosPF() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        assertTrue(fabrica.criarContrato() instanceof ContratoPF);
        assertTrue(fabrica.criarProcuracao() instanceof ProcuracaoPF);
    }

    @Test
    public void testProdutosPJ() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PJ");
        assertTrue(fabrica.criarContrato() instanceof ContratoPJ);
        assertTrue(fabrica.criarProcuracao() instanceof ProcuracaoPJ);
    }

    @Test
    public void testMensagens() {
        FabricaAbstrata fabrica = MetodoFabrica.getInstance().obterFabrica("PF");
        assertEquals("Contrato de Pessoa Física gerado", fabrica.criarContrato().gerar());
        assertEquals("Procuração de Pessoa Física emitida", fabrica.criarProcuracao().emitir());
    }
}
