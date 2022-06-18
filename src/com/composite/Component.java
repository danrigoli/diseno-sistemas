package com.composite;

import java.util.List;

public interface Component {
    String open();
    String save();
    String delete();

    void add(Component child) throws Exception;
    void remove(Component child) throws Exception;
    List<Component> getChildren() throws Exception;

}
