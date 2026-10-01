package abstractfactory;

public class MetodoFabrica {

    private static MetodoFabrica instancia;

    private MetodoFabrica() {
    }

    public static MetodoFabrica getInstance() {
        if (instancia == null) {
            instancia = new MetodoFabrica();
        }
        return instancia;
    }

    public FabricaAbstrata obterFabrica(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("abstractfactory.Fabrica" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Fábrica inexistente");
        }
        if (!(objeto instanceof FabricaAbstrata)) {
            throw new IllegalArgumentException("Fábrica inválida");
        }
        return (FabricaAbstrata) objeto;
    }
}
