package com.company;


public class MyLinkedList<T> {

    protected int size = 0;
    protected Element<T> firstElement;
    protected Element<T> lastElement;

    public MyLinkedList() {
        lastElement = new Element<T>(null, firstElement, null);
        firstElement = new Element<T>(null, null, lastElement);
    }

    public void add(T element) {
        Element<T> prevElement = lastElement;
        lastElement = new Element<T>(element, prevElement, null);
        prevElement.setNext(lastElement);
        size++;
    }


    private static class Element<T> {
        private T value;
        private Element<T> next;
        private Element<T> prev;

        private Element(T value, Element<T> next, Element<T> prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public T getValue() {
            return this.value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Element<T> getNext() {
            return this.next;
        }

        public void setNext(Element<T> next) {
            this.next = next;
        }

        public Element<T> getPrev() {
            return this.prev;
        }

        public void setPrev(Element<T> prev) {
            this.prev = prev;
        }

    }
}
