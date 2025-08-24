package projeto.fintech.model;

public class Despesa {
    double valorDespesa;
    String valor;
    double totalDespesa;

    public Despesa(){}

    public void adicionarDespesa(double valorReduzido){
        totalDespesa += valorReduzido;
        System.out.println("O valor de R$" + valorReduzido + " foi registrado com sucesso.");
        System.out.println("Despesa atual: R$" + totalDespesa);
    }
}

