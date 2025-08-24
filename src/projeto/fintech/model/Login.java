package projeto.fintech.model;

public class Login {

    private String username;
    private String password;
    boolean logado = false;
    private String email2;
    private String password2;

    public Login() {
    }

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void fazerLogin() {
        boolean logado = true;
        System.out.println("Login Realizado com Sucesso!");
    }
}
