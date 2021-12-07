package projetoyoutube;
public class Gafanhoto extends Pessoa {
    //Attributes
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }
    
    //Methods
    public void viuMaisUm() {
        
    }
    
    //Specials Methods

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" 
                + totAssistido +  '}'; /* super.toString mostra os dados da 
                                                    superclasse Pessoa */
    }
    
    
    
}
