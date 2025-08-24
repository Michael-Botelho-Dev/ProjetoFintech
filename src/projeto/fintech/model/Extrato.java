package projeto.fintech.model;

public class Extrato {
    private String historico = "";

    public void adicionarReceita(double valor) {
        historico += "Receita: R$" + valor + "\n";
    }

    public void adicionarDespesa(double valor) {
        historico += "Despesa: R$" + valor + "\n";
    }

    public void exibirExtrato() {
        System.out.println("Extrato");
        System.out.println(historico);
    }
}



