package com.prototype;

public abstract class Shape {

    private String name;

    private Paint paint;

    Shape(String name, Paint paint) {
        this.name = name;
        this.paint = paint;
    }

    public abstract Shape clone();

    public Paint getPaint() {
        return paint;
    }

    public String getName() {
        return name;
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
        return name.equals(shape.name) &&
                paint.equals(shape.paint);
    }
}
