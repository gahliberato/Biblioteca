public class Livro {
    // Atributos privados para segurança (encapsulamento) [4]
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private boolean disponibilidade;

    // Construtor: Obriga a passar os dados ao criar o objeto [5]
    public Livro(int id, String titulo, String autor, int ano) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.disponibilidade = true; // Valor padrão inicial [3]
    }

    // Métodos Getters e Setters para acessar e alterar os dados [6]
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    // Método para exibir as informações do livro como texto [5, 6]
    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' + ", ano=" + ano +
                ", disponibilidade=" + disponibilidade + '}';
    }
}