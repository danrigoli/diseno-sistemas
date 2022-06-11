package com.composite;

import java.util.List;

public class JsonFile implements Component {

    public String content;

    JsonFile(String content) {
        this.content = content;
    }

    @Override
    public String open() {
        return content;
    }

    @Override
    public void save() {
        System.out.println("DEBUG: SAVES JSON FILE");
    }

    @Override
    public void delete() {
        System.out.println("DEBUG: DELETES JSON FILE");

    }

    @Override
    public void add(Component child) throws Exception {
        throw new Exception("Not a folder");
    }

    @Override
    public void remove(Component child) throws Exception {
        throw new Exception("Not a folder");
    }

    @Override
    public List<Component> getChildren() throws Exception {
        throw new Exception("Not a folder");
    }
}
