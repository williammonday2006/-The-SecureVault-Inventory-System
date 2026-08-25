package com.securevault.app;

import com.securevault.core.VaultItem;
import com.securevault.core.VaultManager;
import com.securevault.specialty.FragileItem;
import com.securevault.exceptions.InvalidItemValueException;

public class Main {

    public static void main(String[] args) {

        try {

            VaultItem[] items = {
                    new VaultItem("Diamond", 50000),
                    new FragileItem("Painting", 15000, true),
                    new VaultItem("Gold Bar", 30000),
                    new FragileItem("Glass Statue", 5000, true),
                    new VaultItem("Watch", 10000)
            };

            System.out.println("Before sorting:");

            for (VaultItem item : items) {
                System.out.println(item);
            }

            VaultManager.selectionSort(items);

            System.out.println("\nAfter sorting:");

            for (VaultItem item : items) {
                System.out.println(item);
            }

        } catch (InvalidItemValueException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}