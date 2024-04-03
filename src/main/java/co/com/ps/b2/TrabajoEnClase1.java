package co.com.ps.b2;
// Clase Auto
public class TrabajoEnClase1 {
    String brand, color,  model;
    int fabricationYear, mileage;
    double price;
    boolean onOff;

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
        System.out.print(this.brand + "\n");
        System.out.print(this.model + "\n");
        System.out.print(this.mileage + " Km\n");
        System.out.print(this.color + "\n");
        System.out.print(this.price + "\n");
        System.out.print(this.fabricationYear+ "\n");
    }

}
