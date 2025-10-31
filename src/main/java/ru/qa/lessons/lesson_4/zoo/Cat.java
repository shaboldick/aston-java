package ru.qa.lessons.lesson_4.zoo;

public class Cat extends Animal {
    private boolean isFull = false;
    private int foodNeeded;

    public Cat(String name, int foodNeeded) {
        super(name, 200, 0);
        this.foodNeeded = foodNeeded;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(FoodBowl bowl) {
        if (isFull) {
            System.out.println(name + " уже сыт и не ест.");
            return;
        }

        if (bowl.getFoodAmount() >= foodNeeded) {
            bowl.reduceFood(foodNeeded);
            isFull = true;
            System.out.println(name + " поел и насытился! Съел: " + foodNeeded + " еды.");
        } else {
            System.out.println(name + " хотел поесть " + foodNeeded + " еды, но в миске только " + bowl.getFoodAmount() + ". Не хватило!");
        }
    }
}