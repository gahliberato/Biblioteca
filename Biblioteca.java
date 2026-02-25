import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scanMain = new Scanner(System.in);
        List<Livro> listaLivros = new ArrayList<>();
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Funcionario> listaFuncionarios = new ArrayList<>();
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
                case 6: // ADICIONAR USUÁRIO [7]
                    listaUsuarios.add(serv.adicionarUsuarios(idControle++));
                    break;
                case 7: // LISTAR USUÁRIOS [8]
                    serv.listarUsuarios(listaUsuarios);
                    break;
                case 8: // ADICIONAR FUNCIONÁRIO [9]
                    listaFuncionarios.add(serv.adicionarFuncionarios(idControle++));
                    break;
                case 9: // LISTAR FUNCIONÁRIOS [10]
                    serv.listarFuncionarios(listaFuncionarios);
                    break;
            }
        } while (continuar);
    }
}