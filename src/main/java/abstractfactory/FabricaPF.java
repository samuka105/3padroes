package abstractfactory;

public class FabricaPF implements FabricaAbstrata {

    public Contrato criarContrato() {
        return new ContratoPF();
    }

    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}
