package com.securevault.app;

import com.securevault.core.VaultItem;
import com.securevault.exceptions.InvalidItemValueException;

public class Main {

    public static void main(String[] args) {

        try {

            VaultItem validItem =
                    new VaultItem("Diamond", 50000);

            System.out.println(validItem);

            VaultItem invalidItem =
                    new VaultItem("Broken Item", -100);

            System.out.println(invalidItem);

        } catch (InvalidItemValueException e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}