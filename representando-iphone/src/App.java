import Funcionalidades.Musica;
import Funcionalidades.NavegaInternet;
import Funcionalidades.Telefone;
import iPhone.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone telemovel = new Iphone();

        telemovel.tocarTelefone();
        telemovel.reprodruzirMusica();
        telemovel.acessaInternet();
    }
}
