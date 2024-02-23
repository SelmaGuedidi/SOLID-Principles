package com.directi.training.ocp.exercise_refactored;

public class ResourceAllocator
{

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId=resource.findFreeSlot();
        resource.makeSlotBusy(resourceId);
        return resourceId;
    }

    public void free(Resource resourceType, int resourceId)
    {
        resourceType.markSlotFree(resourceId);
    }

   
}
