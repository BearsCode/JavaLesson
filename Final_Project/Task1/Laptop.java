/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java. */

public class Laptop {
   private String brand;
   private String model;
   private double price;
   private double screenSize;
   private String processor;
   private int ram;
   private int storage;
   private String graphics;
   private String os;
   
   public Laptop(String brand, String model, double price, double screenSize, String processor, int ram, int storage, String graphics, String os) {
   }
   
   @Override
   public String toString() {
   }
   
   @Override 
   public boolean equals(Object o) 
   }
   
   @Override
   public int hashCode() {
   }
   
   public int compareTo(Laptop other) {
   }
   
   public boolean isBrand(String brand) {
   }
   
   public int totalRam(List<Laptop> laptops) {
   }
   
   public void addLaptop(Laptop laptop) {
   }
   
   public void removeLaptop(Laptop laptop) {
   }
}

public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public double getScreenSize() {
    return screenSize;
}

public void setScreenSize(double screenSize) {
    this.screenSize = screenSize;
}

public String getProcessor() {
    return processor;
}

public void setProcessor(String processor) {
    this.processor = processor;
}

public int getRam() {
    return ram;
}

public void setRam(int ram) {
    this.ram = ram;
}

public int getStorage() {
    return storage;
}

public void setStorage(int storage) {
    this.storage = storage;
}

public String getGraphics() {
    return graphics;
}

public void setGraphics(String graphics) {
    this.graphics = graphics;
}

public String getOs() {
    return os;
}

public void setOs(String os) {
    this.os = os;
}