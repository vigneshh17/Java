package Day17;

import java.io.Serializable;

class Vehicle implements Serializable {

    private static final long serialVersionUID = 30L;
    String color;
    String name;
    int modelyear;
    String model;
    transient int numberplate;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModelyear() {
        return modelyear;
    }

    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberplate() {
        return numberplate;
    }

    public void setNumberplate(int numberplate) {
        this.numberplate = numberplate;
    }

    public Vehicle(String color, String name, int modelyear, String model, int numberplate){

    this.color=color;
    this.name=name;
    this.modelyear=modelyear;
    this.model=model;
    this.numberplate=numberplate;

    }

}
