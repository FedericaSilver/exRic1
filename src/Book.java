/*
Aggiungere un attributo String author.
	▪	Implementare il metodo displayDetails() per visualizzare i dettagli del libro.
 */
public class Book extends AbstracItem{
    private String author;
    public Book(String name, Double price, String author){
        super(name, price);
        this.author = author;
        isAvailable();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }

    @Override
    public void setAvailable(Boolean available) {
        super.setAvailable(available);
    }

    @Override
    public void displayDetails() {
        System.out.println("Dettagli prodotto libro: " + getName() + " " + getAuthor() + " " + getPrice() + " " + isAvailable());

    }

}
