package iPhone;

import Funcionalidades.Musica;
import Funcionalidades.NavegaInternet;
import Funcionalidades.Telefone;

public class Iphone implements Telefone, Musica, NavegaInternet{
    public void tocarTelefone()
    {
        System.out.println("Tocando telefone...");
    }

    public void reprodruzirMusica()
    {
        System.out.println("Reproduzindo música...");
    }

    public void acessaInternet()
    {
        System.out.println("Acessando internet...");
    }
}
