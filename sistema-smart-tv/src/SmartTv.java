public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }

    public void mudarVolume(int novoVolume){
        volume = novoVolume;
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void aumentarVolume(){
        volume++;
    }

    public void diminuirVolume(){
        if (volume == 0)
            volume = 0;
        else
            volume--;
    }

    public void tvLigada(boolean ligada, int canal, int volume){
        if(ligada == false)
        {
            System.err.println("TV ta ligada? " + ligada + "\n");
        }
        else
        {
            System.err.println("TV ta ligada?" + ligada + "\n");
            System.err.println("Canal atual: " + canal + "\n");
            System.err.println("Volume atual: " + volume + "\n");
        }
    }
}