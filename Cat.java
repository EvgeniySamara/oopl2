public class Cat {
    private String name;
    private int appetite;
    private boolean nothungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.nothungry = false;
    }
    public void eat(Plate plate) { 

        int value = plate.getFood();
        if (value >= this.appetite) {
          plate.setFood(plate.getFood() - this.appetite);    
          this.nothungry = true;
          System.out.println("Съел "+ String.valueOf(appetite));
        }
    
    }
    public boolean getHungry() {
        return nothungry;
    }   

    
    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        String txt = new String();
        if (nothungry) txt = "Не голоден";
        else txt = "Голоден";
        return name + " " + String.valueOf(appetite)+" "+txt;
    }
}