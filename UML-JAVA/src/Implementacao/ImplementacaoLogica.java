package Implementacao;

import AparelhoTelefonico.Ligar;
import NavegandorInternet.ExibirPagina;
import ReprodutorMusical.SelecionarMusica;

public class ImplementacaoLogica  implements SelecionarMusica, Ligar, ExibirPagina{

    public void Musica() {
        System.out.println("OUVINDO MUSICA VIA Iphone");
        
    }

    public void numero() {
        System.out.println("Ligando via Iphone");
        
    }

    public void url() {
        System.out.println("Navegando na WEB via Iphone");
        
    }
    
}

  
