package com.composite;

import java.util.List;

public class TxtFile implements Component {

    public String content;

    TxtFile(String content) {
        this.content = content;
    }

    @Override
    public String open() {
        return content;
    }

    @Override
    public void save() {
        System.out.println("DEBUG: SAVES TXT FILE");
    }

    @Override
    public void delete() {
        System.out.println("DEBUG: DELETES TXT FILE");

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
