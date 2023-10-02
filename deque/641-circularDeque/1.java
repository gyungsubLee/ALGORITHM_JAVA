class MyCircularDeque {
    private int maxSize, current;
    private Node head, tail;

    public MyCircularDeque(int k) {
        this.maxSize = k;
        this.current = 0;
        head = tail = new Node(-1);
        tail.prev = head;
        head.next = tail;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }

        Node newNode = new Node(value);
        newNode.next = head.next;
        head.next = newNode;
        newNode.prev = head;
        // tail = newNode; 와 헷갈렸으나, 앞에서부터 추가하기 때문에 tail로 입력 시 하나 이상이 추가되는 경우 오류가 발생함.
        newNode.next.prev = newNode; 
        current++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }


        Node newNode = new Node(value);
        newNode.prev = tail.prev;
        tail.prev = newNode;
        newNode.next = tail;
        newNode.prev.next = newNode;
        current++;
        return true;
    }
    
    public boolean deleteFront() {
         if (isEmpty()) {return false;}
        head.next = head.next.next;
        head.next.prev = head;
        current--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {return false;}
        tail.prev = tail.prev.prev;
        tail.prev.next = tail;
        current--;
        return true;
    }
    
    public int getFront() {
        return isEmpty()? -1 : head.next.value;
    }
    
    public int getRear() {
        return isEmpty()? -1 : tail.prev.value;
    }
    
    public boolean isEmpty() {
        return current == 0;
    }
    
    public boolean isFull() {
        return current == maxSize;
    }

    private class Node {
        int value;
        Node next, prev;
        Node(int value){
            this.value = value;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */