
import javax.xml.crypto.Data;

public class Emprestimo {
    private int id;
    private Data devolucao;
    private Data dataInicio;
    private Usuario usuario;
    private Funcionario funcionario;
    private Livro livro;

    public Emprestimo(int id, Data devolucao, Data dataInicio, Usuario usuario, Funcionario funcionario, Livro livro) {
        this.id = id;
        this.devolucao = devolucao;
        this.dataInicio = dataInicio;
        this.usuario = usuario;
        this.funcionario = funcionario;
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Data getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Data devolucao) {
        this.devolucao = devolucao;
    }

    public Data getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

public void exibirInfor() {
        System.out.println("/nId:" + id + "/nData de Devolução:" + devolucao + "/nData de Início:" + dataInicio + "/nUsuário:" + usuario.getNome() +  "/nFuncionário:" + funcionario.getNome() + "/nLivro:" + livro.getTitulo());
        System.out.println("-----------------------");
    }
}
