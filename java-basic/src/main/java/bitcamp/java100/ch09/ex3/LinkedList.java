package bitcamp.java100.ch09.ex3;

public class LinkedList {
    private class Box {
        Object value;
        Box next;
    }

    Box head;
    Box tail;
    
    int len;
    
    public void add(Object value) {
        Box box = new Box();
        
        box.value = value;
        
        if(tail == null) {
            head = box;
            tail = box;
        }
        
        else {
            tail.next = box;
            tail = box;
        }
        len++;
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
        if(index < 0 || index >= len) {
            return;
        }
        
        len++;
        Box pre = head;
        Box box = new Box();
        box.value = value;
        if(index == 0) {
            box.next = head;
            head = box;
            return;
        }
        for(int i = 0; i < index-1; i++) {
            pre = pre.next;
        }
        box.next = pre.next;
        pre.next = box;
    }
    
    public Object remove(int index) {
        if(index < 0 || index > len) {
            return null;
        }
        len--;
        Box removedBox;
        
        if(index == 0) {
            removedBox = head;
            head = head.next;
            
            return removedBox.value;
        }
        Box pre = head;
        for(int i = 0; i < index-1; i++) {
            pre = pre.next;
        }
        removedBox = pre.next;
        pre.next = pre.next.next;
        if(index == len - 1) {
            tail = pre;
        }
        return removedBox.value;
    }
}
























