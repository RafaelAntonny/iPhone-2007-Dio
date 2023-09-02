import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void exibirPagina(String url) {

        System.out.println("Exibindo pagina: " + url);

    }


    @Override
    public void adicionarNovaAba() {
        
        System.out.println("Nova aba criada");

    }


    @Override
    public void atualizarPagina(String url) {
        
        System.out.println("Pagina atualizada: " + url);

    }


    @Override
    public void ligar(String numero) {
        

        System.out.println("Ligando para numero: " + numero);

    }


    @Override
    public void atender(String numero) {
        
        System.out.println("Numero atendido: " + numero);

    }


    @Override
    public void iniciarCorreioVoz() {
        

        System.out.println("Correio de voz iniciado");

    }


    @Override
    public void tocar(String musica) {
        

        System.out.println("Tocando musica: " + musica);

    }


    @Override
    public void pausar(String musica) {
        

        System.out.println("Musica pausada: " + musica);

    }


    @Override
    public void selecionarMusica(String musica) {
        

        System.out.println("Musica selecionada: " + musica);

    }
}
