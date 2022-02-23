package com.company;

//address, cows, horses, sheep, OwnerName

public class Farm {

    private String address;
    private Cow [] cows;
    private Hourse [] hourses;
    private Sheep [] sheep;
    private String OwnerName;

    public Farm(String address, Cow[] cows, Hourse[] hourses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.hourses = hourses;
        this.sheep = sheep;
        OwnerName = ownerName;
    }

    public Farm(String address, Cow[] cows, Hourse[] hourses, Sheep[] sheep) {
    }

    @Override
    public String toString(){
        return "Адрес:" + this.address + " уйлардын саны:" + cows.length + " жылкылардын саны:" + hourses.length +
                " койлордун саны:" + sheep.length + " ферманын аты:" + OwnerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Hourse[] getHourses() {
        return hourses;
    }

    public void setHourses(Hourse[] hourses) {
        this.hourses = hourses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
