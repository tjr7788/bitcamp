package exaple;

public class LinkedList {
    private class Box {
        Object value;
        Box next;
    }

    private Box head;
    private Box tail;
    private int len;


    public void add(Object value) {
        Box box = new Box();
        box.value = value;
        len++;
        if (tail == null) {
            head = box;
            tail = box;
            return;
        }
        tail.next = box;
        tail = box;
    }

    public int size() {
        return len;
    }

    public Object get(int index) {
        if(index < 0 || index >= len) {
            return null;
        }
        Box box = head;
        for(int i = 0; i < index; i++) {
            box = box.next;
        }
        return box.value;
    }

    public void insert(int index, Object value) {
        if(index < 0 || index > len) {
            return;
        }

        if(index == len) {
            add(value);
            return;
        }
        Box box = new Box();
        Box pre = head;
        box.value = value;
        len++;
        if (index == 0) {
            box.next = head;
            head = box;
            return;
        }
        for(int i = 0; i < index - 1; i++) {
            pre = pre.next;
        }
        box.next = pre.next;
        pre.next = box;
    }

    public Object remove(int index) {
        if(index < 0 || index >= len) {
            return null;
        }
        Box removeData;
        len--;
        if(index == 0) {
            removeData = head;
            head = head.next;

            return removeData.value;
        }
        Box box = head;
        for(int i = 0; i < index-1; i++) {
            box = box.next;
        }
        removeData = box.next;
        box.next = box.next.next;

        if(index == len) {
            tail = box;
        }

        return removeData.value;
    }
}















