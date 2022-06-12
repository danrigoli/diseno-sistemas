package com.prototype;

public abstract class Shape {

    private String color;
    private String texture;

    Shape(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    Shape(Shape source) {
        this.color = source.color;
        this.texture = source.texture;
    }

    public abstract Shape clone();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Shape shape = (Shape) o;
        return color.equals(shape.color) && texture.equals(shape.texture);
    }
}
