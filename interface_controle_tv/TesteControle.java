package interface_controle_tv;

public class TesteControle {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        
        controle.ligar();
        controle.maisVolume();
        controle.play();
        controle.abrirMenu();
        controle.fecharMenu();

        System.out.println("\f");
    }
}
