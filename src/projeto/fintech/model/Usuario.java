package projeto.fintech.model;

public class Usuario {
    private String nome;
    private String nascimento;
    private String cpf;
    private String email;
    private String celular;
    private String password;

    public void realizarCadastro(String nome, String nascimento, String cpf, String email, String celular, String password){
        this.nome = nome;
        this.nascimento = nascimento;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
        this.password = password;

        System.out.println("Cadastrando Usuario" + nome);
    }

    public void realizarCadastro(){}

}
