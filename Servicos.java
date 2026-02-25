import java.util.List;
import java.util.Scanner;

public class  Servicos{
    // Objeto scanner para ler as entradas do usuário [5]
    Scanner scanner = new Scanner(System.in);

    // Método da Parte 1 [1]
    public int opcao() {
        System.out.println("Digite a opção desejada:");
        System.out.println("1 - Adicionar livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Emprestar livro");
        System.out.println("4 - Devolver livro");
        System.out.println("5 - Excluir livro");
        System.out.println("6 - Adicionar usuário");
        System.out.println("7 - Listar usuários");
        System.out.println("8 - Adicionar funcionário");
        System.out.println("9 - Listar funcionários");
        System.out.println("10 - Encerrar programa");
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
            livros.get(i).exibirInfor(); // Usa o método exibirInfor da classe Livro [8]
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

    public Usuario adicionarUsuarios(int matricula) {
        System.out.println("Digite a quantidade de empréstimos realizados:");
        int qtdEmprestimos = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o nome do usuário:");
        String nome  = scanner.nextLine();
        System.out.println("\nUsuário adicionado com sucesso!\n");
        return new Usuario(matricula,qtdEmprestimos,nome); // Retorna o novo objeto [6]
    }

    // Método da Parte 2 [3, 7]
    public void listarUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("\nNenhum usuário cadastrado.\n");
            return;
        }
        System.out.println("\n--- Lista de Usuários ---");
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).exibirInfor(); // Usa o método exibirInfor da classe Usuario [8]
        }
    }

     public Funcionario adicionarFuncionarios(int id) {
        System.out.println("Digite o nome do funcionário:");
        String nome  = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário:");
        int CPF = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a função do funcionário:");
        String funcao = scanner.nextLine();
        System.out.println("\nFuncionário adicionado com sucesso!\n");
        return new Funcionario(id,nome,CPF,funcao); // Retorna o novo objeto [6]
    }

    // Método da Parte 2 [3, 7]
    public void listarFuncionarios(List<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("\nNenhum funcionário cadastrado.\n");
            return;
        }
        System.out.println("\n--- Lista de Funcionários ---");
        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).exibirInfor(); // Usa o método exibirInfor da classe Funcionario [8]
        }
    }

}