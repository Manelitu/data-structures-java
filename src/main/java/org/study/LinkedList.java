package org.study;

public class LinkedList {
    private Element firstElement;
    private Element lastElement;
    private Integer size;

    public LinkedList() {
        this.size = 0;
    }

    public Element getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(Element firstElement) {
        this.firstElement = firstElement;
    }

    public Element getLastElement() {
        return lastElement;
    }

    public void setLastElement(Element lastElement) {
        this.lastElement = lastElement;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void addValue(String value) {
        Element element = new Element(value);
        if (this.size == 0) this.firstElement = element;
        else this.lastElement.setNextElement(element);
        this.lastElement = element;
        this.size += 1;
    }

    public void removeValue(String value) {
        if (this.size == 0) return;

        Element previousElement = null;
        Element currentElement = this.firstElement;

        for (int i = 0; i < this.size; i += 1) {
            if (currentElement.getValue().equalsIgnoreCase(value)) {
                if (this.size == 1) {
                    this.firstElement = null;
                    this.lastElement = null;
                } else if (currentElement == firstElement) {
                    this.firstElement = currentElement.getNextElement();
                    currentElement.setNextElement(null);
                } else if (currentElement == lastElement) {
                    this.lastElement = previousElement;
                    previousElement.setNextElement(null);
                } else {
                    previousElement.setNextElement(currentElement.getNextElement());
                }
                this.size -= 1;
                break;
            }
            previousElement = currentElement;
            currentElement = currentElement.getNextElement();
        }
    }

    public Element get(Integer index) {
        if (index < 0) return null;

        Element currentElement = this.firstElement;

        for (int i = 0; i < index; i += 1) {
            if (currentElement.getNextElement() != null) {
                currentElement = currentElement.getNextElement();
            }
        }

        return currentElement;
    }
}
