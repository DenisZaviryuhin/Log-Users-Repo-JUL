package org.example.app.view;

import java.util.Scanner;

public class UserUpdateView {
    public String[] getData() {

        Scanner scanner = new Scanner(System.in);

        String title = "Enter contact's ID: ";
        System.out.print(title);
        String id = scanner.nextLine();

        title = "Enter new phone in format xxx xxx-xxxx: ";
        System.out.print(title);
        String phone = scanner.nextLine();

        return new String[]{id, phone};
    }


    public void getOutput(String output) {
        System.out.println(output);
    }
}
