package com.securevault.specialty;

import com.securevault.core.VaultItem;

public class FragileItem  extends  VualtItem{
    private boolean isWarpped;

    public FragileItem(String itemName,String itemValue, boolean isWarpped){
        super(itemName, itemValue);
        this.isWarpped = isWarpped;
    }

    @Override
    public String toString() {
        return "Item: " + itemName + ", Value: $" + itemValue + ", Wrapped: " + isWarpped;
    }
}