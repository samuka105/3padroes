package abstractfactory;

public class FabricaPJ implements FabricaAbstrata {

    public Contrato criarContrato() {
        return new ContratoPJ();
    }

    public Procuracao criarProcuracao() {
        return new ProcuracaoPJ();
    }
}
