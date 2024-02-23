package com.directi.training.lsp.exercise_refactored;

public class ElectronicDuck implements IQUAK,ISWIM
{
    private boolean _on = false;

   

    public void turnOn()
    {
        _on = true;
    }

    public void turnOff()
    {
        _on = false;
    }

    @Override
    public void Swim() {
        // TODO Auto-generated method stub
        if (_on) {
            System.out.println("Electronic duck swim");
        } else {
            throw new RuntimeException("Can't swim when off");
        }
    }

    @Override
    public void Quack() {
        // TODO Auto-generated method stub
        if (_on) {
            System.out.println("Electronic duck quack...");
        } else {
            throw new RuntimeException("Can't quack when off");
        }
    }
}
