package com.directi.training.ocp.exercise_refactored;

public class TimeSlot extends Resource
{
    @Override
    public void markSlotFree(int resourceId) {
    }

    @Override
    public void makeSlotBusy(int resourceId) {
    }

    @Override
    public int findFreeSlot() {
        return 0;
    }
}