package projeto.fintech.model;

public class Recebimento {
    double valorRecebimento;
    String valor;
    double totalReceita;

    public Recebimento(){}

    public void adicionarReceita(double valorAdicionado){
        totalReceita += valorAdicionado;
        System.out.println("O valor de R$" + valorAdicionado + " foi registrado com sucesso.");
        System.out.println("Receita atual: R$" + totalReceita);
    }

}
