/*
Aggiungere un attributo String brand.
	▪	Implementare il metodo displayDetails() per visualizzare i dettagli dell'articolo elettronico.
 */
public class Electronic extends AbstracItem{
    private String brand;

    public Electronic(String name, Double price, String brand){
        super(name, price);
        this.brand = brand;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public boolean isAvailable() {
        return super.isAvailable();
    }

    @Override
    public void displayDetails() {
        System.out.println("Dettagli prodotto: " + getName() + " " + getBrand() + " " + getPrice() + " " + isAvailable());

    }

    @Override
    public void setAvailable(Boolean available) {
        super.setAvailable(available);
    }
}
