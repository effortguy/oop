package com.effortguy.oop.ep04;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    void testEnlarge(Rectangle rectangle, int multiple) {
        rectangle.setRight(rectangle.getRight() * multiple);
        rectangle.setLeft(rectangle.getLeft() * multiple);
    }

}