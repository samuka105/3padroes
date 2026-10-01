package abstractfactory;

public class Main {

    public static void main(String[] args) {
        String[] tipos = {"PF", "PJ"};

        MetodoFabrica metodoFabrica = MetodoFabrica.getInstance();

        for (String tipo : tipos) {
            FabricaAbstrata fabrica = metodoFabrica.obterFabrica(tipo);
            Contrato contrato = fabrica.criarContrato();
            Procuracao procuracao = fabrica.criarProcuracao();

            System.out.println("== Cliente " + tipo + " ==");
            System.out.println(contrato.gerar());
            System.out.println(procuracao.emitir());
            System.out.println();
        }
    }
}
