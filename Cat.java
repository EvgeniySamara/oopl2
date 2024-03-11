public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }
    public void eat(Plate plate) { 
        System.out.println("Поел");
        int value = plate.getFood();
        if (value >= this.appetite) {
          plate.setFood(plate.getFood() - this.appetite);    
          this.hungry = false;
        }
    
    }
    public boolean getHungry() {
        return hungry;
    }   

    
    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }
}