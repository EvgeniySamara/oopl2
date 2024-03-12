public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("Еды в тарелке: " + food);
    }
    public void setFood(int food) {
        if (food>=0) this.food = food;
        else System.out.println("Недостаточно еды");
    }
    public int getFood() {
        return food;
    }
}