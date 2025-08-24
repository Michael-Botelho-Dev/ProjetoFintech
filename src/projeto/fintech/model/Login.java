package projeto.fintech.model;

public class Login {

    private String username;

    private String password;

    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void doLogin(){
        System.out.println("Realizando login para o usuário:" + username);
    }

}
