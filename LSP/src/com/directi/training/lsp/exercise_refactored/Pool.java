package com.directi.training.lsp.exercise_refactored;

public class Pool
{
    public void run()
    {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
       
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(IQUAK... ducks)
    {
        for (IQUAK duck : ducks) {
            duck.Quack();
        }
    }

    private void swim(ISWIM... ducks)
    {
        for (ISWIM duck : ducks) {
            duck.Swim();
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
