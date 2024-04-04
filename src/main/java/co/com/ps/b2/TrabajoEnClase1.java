package co.com.ps.b2;
// Clase Auto
public class TrabajoEnClase1 {
   private String brand, color,  model;
   private int fabricationYear, mileage;
   private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFabricationYear() {
        return fabricationYear;
    }

    public void setFabricationYear(int fabricationYear) {
        this.fabricationYear = fabricationYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    private boolean onOff;

    public TrabajoEnClase1(String brand, String color, String model, int fabricationYear, int mileage, double price, boolean onOff) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.fabricationYear = fabricationYear;
        this.mileage = mileage;
        this.price = price;
        this.onOff = onOff;
    }

    public void encender() {
        onOff = true;
        System.out.println("El auto ha sido encendido.\n");
    }
    public void apagar() {
        onOff = false;
        System.out.println("El auto ha sido apagado.\n");
    }

    public void acelerar (int velocidad){
        System.out.print("El auto tiene una Velocidad de: " + velocidad + " Km por hora\n");
    }
    public void datos(){
        System.out.println(this.brand );
        System.out.println(this.model );
        System.out.println(this.mileage );
        System.out.println(this.color );
        System.out.println(this.price );
        System.out.println(this.fabricationYear);
    }

}
