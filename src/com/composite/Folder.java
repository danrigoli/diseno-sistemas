package com.composite;

import java.util.List;

public class Folder implements Component {

    List<Component> children;

    Folder(List<Component> children) {
        this.children = children;
    }

    @Override
    public String open() {
        String contentConcat = "Contenido de hijos: ";
        for (Component child: children) {
            contentConcat += child.open();
            contentConcat += " - ";
        }
        return contentConcat;
    }

    @Override
    public void save() {
        System.out.println("DEBUG: SAVES FOLDER FILE");
    }

    @Override
    public void delete() {
        System.out.println("DEBUG: DELETES FOLDER FILE");

    }

    @Override
    public void add(Component child) {
        children.add(child);
    }

    @Override
    public void remove(Component child) {
        children.remove(child);
    }

    @Override
    public List<Component> getChildren() {
        return children;
    }
}
