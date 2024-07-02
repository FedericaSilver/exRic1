/*
	Creare una classe astratta AbstractItem che implementa l'interfaccia Item.
	◦	La classe deve avere i seguenti attributi:
	▪	String name
	▪	double price
	▪	boolean available
	◦	Implementare i metodi dell'interfaccia Item.
	◦	Definire un costruttore per inizializzare gli attributi.
	◦	Aggiungere un metodo astratto void displayDetails().
 */
public abstract class AbstracItem implements Item{
    protected String name;
    protected Double price;
    protected boolean available;

    public AbstracItem(String name, Double price){
        this.name = name;
        this.price = price;
        available = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public abstract void displayDetails();
}
