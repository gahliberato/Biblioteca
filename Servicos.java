import java.util.List;
import java.util.Scanner;

public class Servicos {
    // Objeto scanner para ler as entradas do usuário [5]
    Scanner scanner = new Scanner(System.in);

    // Método da Parte 1 [1]
    public int opcao() {
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Empréstimo de livro");
        System.out.println("4 - Devolver livro");
        System.out.println("5 - Excluir livro");
        System.out.println("6 - Encerrar programa");
        int op = scanner.nextInt();
        scanner.nextLine(); // Consome a linha [5]
        return op;
    }

    // Método da Parte 2 [2]
    public Livro adicionarLivro(int id) {
        System.out.println("Digite o título do livro:");
        String titulo = scanner.nextLine();
        System.out.println("Digite o autor do livro:");
        String autor = scanner.nextLine();
        System.out.println("Digite o ano de lançamento:");
        int ano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("\nLivro adicionado com sucesso!\n");
        return new Livro(id, titulo, autor, ano); // Retorna o novo objeto [6]
    }

    // Método da Parte 2 [3, 7]
    public void listarLivros(List<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("\nNenhum livro cadastrado.\n");
            return;
        }
        System.out.println("\n--- Lista de Livros ---");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(livros.get(i).toString()); // Usa o toString da classe Livro [8]
        }
    }

    // Método da Parte 2 [4, 9]
    public void emprestarLivro(List<Livro> livros, int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (livro.isDisponibilidade()) {
                    livro.setDisponibilidade(false);
                    System.out.println("Livro emprestado com sucesso: " + livro.getTitulo());
                } else {
                    System.out.println("O livro '" + livro.getTitulo() + "' já foi emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    // Método da Parte 3 [10, 11]
    public void devolverLivro(List<Livro> livros, int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                if (!livro.isDisponibilidade()) {
                    livro.setDisponibilidade(true);
                    System.out.println("Livro devolvido com sucesso: " + livro.getTitulo());
                } else {
                    System.out.println("O livro não está emprestado!");
                }
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }

    // Método da Parte 3 [12]
    public void removerLivro(List<Livro> livros, int id) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == id) {
                System.out.println("Livro removido com sucesso: " + livros.get(i).getTitulo());
                livros.remove(i);
                return;
            }
        }
        System.out.println("Livro com ID " + id + " não encontrado.");
    }
}