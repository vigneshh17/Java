package Day17;

import java.io.Serializable;

class Serials implements Serializable {

    public static final long serialVersionUID = 500L;
    static String gender="female";
    int age;
    String address;
    transient String currency;
    transient int weight;
    public Serials(int age, String address, String currency, int weight){
    this.age=age;
    this.address=address;
    this.currency = currency;
    this.weight= weight;
    }

    public static String getGender() {
        return gender;
    }

    public static void setGender(String gender) {
        Serials.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
