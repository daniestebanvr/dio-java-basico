public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv1 = new SmartTv();
        smartTv1.ligar();
        smartTv1.mudarCanal(56);;
        smartTv1.mudarVolume(100);
        smartTv1.tvLigada(smartTv1.ligada, smartTv1.canal, smartTv1.volume);
    }
}
