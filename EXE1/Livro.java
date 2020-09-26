package exe1;

public class Livro {
    private String isbn;
    
    public Livro(String isbn){
        this.setIsbn(isbn);
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }  
}
