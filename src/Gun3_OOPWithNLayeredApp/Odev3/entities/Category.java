package Gun3_OOPWithNLayeredApp.Odev3.entities;

public class Category {
    private int id;
    public String name;

    public Category() {

    }

    public Category(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
