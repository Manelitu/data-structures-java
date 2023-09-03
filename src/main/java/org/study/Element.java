package org.study;

public class Element {
    private String value;
    private Element nextElement;

    public Element(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
