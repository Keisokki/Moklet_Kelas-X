package Inventory;

public class CD extends Product {
    private String Artist;
    private int Numsong;
    private String label;

    public CD () {
        super();
        Numsong = 0;
        label = "";
        Artist = "";
    }

    public CD (int Number, String Name, int Quantity, double price, String Artist, int Numsong, String label) {
        super(Number, Name, Quantity, price);
        this.Artist = Artist;
        this.Numsong = Numsong;
        this.label = label;
    }

    public String getArtist() {
        return this.Artist;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public int getNumsong() {
        return this.Numsong;
    }

    public void setNumsong(int Numsong) {
        this.Numsong = Numsong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public void print() {
        super.print();
        System.out.println("Artist: " + Artist);
        System.out.println("Number of Song: " + Numsong);
        System.out.println("Label: " + label);
        System.out.println("--------------------------------");
    }

}
