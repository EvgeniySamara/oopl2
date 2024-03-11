public class Cat {
    private String name;
    private int appetite;
    public boolean full;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() { 
        System.out.println("Поел");
    }
    public int getAppetite() {
        return appetite;
    }
}