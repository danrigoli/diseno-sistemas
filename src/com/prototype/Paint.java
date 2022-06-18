package com.prototype;

public class Paint {

    private String color;
    private String texture;

    Paint(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Paint paint = (Paint) o;
        return paint.getColor().equals(paint.getColor()) &&
                paint.getTexture().equals(paint.getTexture());
    }
}
