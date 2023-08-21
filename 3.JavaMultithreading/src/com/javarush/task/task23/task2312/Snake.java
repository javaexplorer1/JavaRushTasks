package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

public class Snake {

    private List<SnakeSection> sections = new ArrayList<>();
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        SnakeSection section = new SnakeSection(x, y);
        sections.add(section);
        isAlive = true;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public List<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public void move() {

    }
}
