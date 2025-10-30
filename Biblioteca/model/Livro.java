import java.util.concurrent.atomic.AtomicInteger;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int ano;
    private String isbn;
    private String categoria;
    private int totalCopias;
    private int copiasDispoveis;
    private Editora editora;

    public Livro(int id, String titulo, String autor, int ano, String isbn, String categoria, int totalCopias, int copiasDispoveis, Editora editora) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.isbn = isbn;
        this.categoria = categoria;
        this.totalCopias = totalCopias;
        this.copiasDispoveis = copiasDispoveis;
        this.editora = editora;
    }

    public boolean emprestrar() {
        if (copiasDispoveis > 0) {
            copiasDispoveis--; return true;
        }
        return false;
    }
    public void devolucao() {
        if (copiasDispoveis < totalCopias) copiasDispoveis++;
    }

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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(int totalCopias) {
        this.totalCopias = totalCopias;
    }

    public int getCopiasDiscipiveis() {
        return copiasDispoveis;
    }

    public void setCopiasDiscipiveis(int copiasDiscipiveis) {
        this.copiasDispoveis = copiasDiscipiveis;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                ", isbn='" + isbn + '\'' +
                ", categoria='" + categoria + '\'' +
                ", totalCopias=" + totalCopias +
                ", copiasDiscipiveis=" + copiasDispoveis +
                ", editora=" + editora +
                '}';
    }


}
