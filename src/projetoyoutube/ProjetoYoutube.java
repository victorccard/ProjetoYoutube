package projetoyoutube;
public class ProjetoYoutube {
    public static void main(String[] args) {
       // Classe Video
        Video v[] = new Video[3];
       v[0] = new Video("Aula 01 - POO");
       v[1] = new Video("Aula 05 - HTML");
       v[2] = new Video("Aula 03 - PYTHON");
        
       // Classe Gafanhoto
      Gafanhoto g[] = new Gafanhoto[2];
      g[0] = new Gafanhoto("Silvio", 12, "Masculino", "Silsil");
      g[1] = new Gafanhoto("Carlos", 23, "Masculino", "carlaodamassa");
        
      // Classe Visualizacao
      Visualização vis[] = new Visualização[5];
      vis[0] = new Visualização(g[0], v[1]); //Silvio assiste HTML
      System.out.println(vis[0].toString());
      vis[0].avaliar();
      
      vis[1] = new Visualização(g[0], v[2]);  // Carlos asssiste Python
      System.out.println(vis[0].toString()); 
      vis[0].avaliar(7.0f);
    }
    
}
