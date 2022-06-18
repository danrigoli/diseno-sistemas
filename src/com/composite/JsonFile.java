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
    public String save() {
        return "SAVES JSON FILE";
    }

    @Override
    public String delete() {
        return "DELETES JSON FILE";

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
