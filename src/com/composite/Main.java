package com.composite;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Component jsonFile1 = new JsonFile("{ content: 'for json file' }");
        Component jsonFile2 = new JsonFile("{ content: 'for json file 2' }");
        Component txtFile1 = new TxtFile("Content for txt file");
        Component txtFile2 = new TxtFile("Content for txt file 2");

        Component folder = new Folder(List.of(jsonFile1, txtFile2, txtFile1));

        try {
            folder.getChildren();
            System.out.println(folder.open());
            System.out.println(folder.save());
            System.out.println(jsonFile2.delete());
            System.out.println(jsonFile2.open());
            jsonFile2.getChildren();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }

}