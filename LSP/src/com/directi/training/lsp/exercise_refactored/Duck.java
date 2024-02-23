package com.directi.training.lsp.exercise_refactored;

public class Duck implements IQUAK,ISWIM
{
    @Override
    public void Swim() {
        // TODO Auto-generated method stub
        System.out.println("Swim...");
    }

    @Override
    public void Quack() {
        // TODO Auto-generated method stub
        System.out.println("Quack...");
    }
}
