package com.composite;

import java.util.List;

public class Folder implements Component {

    private List<Component> children;

    Folder(List<Component> children) {
        this.children = children;
    }

    @Override
    public String open() {
        StringBuilder contentConcat = new StringBuilder("Contenido de hijos: ");
        for (Component child: children) {
            contentConcat.append(child.open());
            contentConcat.append(" - ");
        }
        return contentConcat.toString();
    }

    @Override
    public String save() {
        return "SAVES FOLDER";
    }

    @Override
    public String delete() {
        return "DELETES FOLDER FILE";
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
