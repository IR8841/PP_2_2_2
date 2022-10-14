package model;



public class Car {

    private int id_car;

    private String model;

    private int series;

    public Car(int id_car, String model, int series) {
        this.id_car = id_car;
        this.model = model;
        this.series = series;
    }

    public int getId_car() {
        return id_car;
    }

    public void setId_car(int id_car) {
        this.id_car = id_car;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id_car=" + id_car +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
