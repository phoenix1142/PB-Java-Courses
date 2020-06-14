package homework.lesson6;

import java.util.Objects;

public class Truck extends Auto {
    public int productWeight;
    public int addProductWeight;
    protected int maxProductWeight = 25;

    /**
     * Конструктор класса Truck
     * @param producer
     * @param model
     * @param engineType
     * @param productWeight
     */
    public Truck(String producer, String model, String engineType, int productWeight) {
        super(producer, model, engineType);
        this.productWeight = productWeight;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public int getAddProductWeight() {
        return addProductWeight;
    }

    public void setAddProductWeight(int addProductWeight) {
        this.addProductWeight = addProductWeight;
    }

    /**
     * Метод проверки загруженности фуры
     * @param addProductWeight
     */
    public void addTransferProduct(int addProductWeight){
        this.addProductWeight = addProductWeight;
        if (productWeight + addProductWeight > maxProductWeight){
            System.out.println("Фура перегруженна и тронуться не сможет, разгрузите часть товара");
        }else {
            System.out.println("Фура готова к транспортировке!");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return productWeight == truck.productWeight &&
                addProductWeight == truck.addProductWeight &&
                maxProductWeight == truck.maxProductWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), productWeight, addProductWeight, maxProductWeight);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "productWeight=" + productWeight +
                ", addProductWeight=" + addProductWeight +
                ", maxProductWeight=" + maxProductWeight +
                '}';
    }
}
