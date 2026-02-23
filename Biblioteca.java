import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanMain = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();
        Servicos serv = new Servicos();
        int idControle = 1;
        boolean continuar = true;

        do {
            int escolha = serv.opcao();
            switch (escolha) {
                case 1:
                    listaLivros.add(serv.adicionarLivro(idControle++));
                    break;
                case 2:
                    serv.listarLivros(listaLivros);
                    break;
                case 3:
                    System.out.println("ID para empréstimo:");
                    serv.emprestarLivro(listaLivros, scanMain.nextInt());
                    break;
                case 4: // DEVOLVER [11]
                    System.out.println("ID para devolução:");
                    serv.devolverLivro(listaLivros, scanMain.nextInt());
                    break;
                case 5: // EXCLUIR [10]
                    System.out.println("ID para remover:");
                    serv.removerLivro(listaLivros, scanMain.nextInt());
                    break;
                case 6:
                    System.out.println("Encerrado, amore!");
                    continuar = false;
                    break;
            }
        } while (continuar);
    }
}