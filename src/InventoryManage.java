import java.util.HashSet;

/*
Creare una classe InventoryManager per gestire l'inventario.
	◦	Utilizzare un HashSet<Item> per memorizzare gli articoli.
	◦	Implementare i seguenti metodi:
	▪	void addItem(Item item): aggiunge un articolo all'inventario se non è null.
	▪	void removeItem(Item item): rimuove un articolo dall'inventario se non è null.
	▪	void displayInventory(): visualizza i dettagli di tutti gli articoli nell'inventario, gestendo i valori null.
 */
public class InventoryManage {
    private HashSet<Item> articoli;

    public InventoryManage(){
        articoli = new HashSet<>();
    }
    public void addItem(Item item){
            if(item != null ){
                articoli.add(item);
            } else {
                System.err.println("BASTAAAA");
                //System.out.flush();
            }



    }
    public void removeItem(Item item){
        articoli.remove(item);

    }
    public void displayInventory(){
        // articoli.forEach(System.out::println); BY DON DONATO
        for(Item element : articoli){
            if(element instanceof  Book || element instanceof Electronic){
                ((AbstracItem) element).displayDetails();
            }

        }

    }

}
