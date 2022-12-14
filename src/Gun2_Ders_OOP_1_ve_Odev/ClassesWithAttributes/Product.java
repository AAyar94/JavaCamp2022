package Gun2_Ders_OOP_1_ve_Odev.ClassesWithAttributes;

public class Product {
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int stockAmount;
    private String _kod;


    public int get_Id() {
        return _id;
    }

    public void set_id(int id){
        this._id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int i) {
        this.stockAmount = stockAmount;
    }

    public String get_kod() {
        return this._name.substring(0,1) + _id;
    }

}
