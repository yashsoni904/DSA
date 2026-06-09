class MyLinkedList {
    
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
            this.next=null;
        }

    }
    private Node head;
    private Node tail;
    private int  size;
    public MyLinkedList() {
        head=null;
        tail=null;
        size=0;
    }
    
    public int get(int index) {
        if(index < 0 ||index>=size) return -1;
        Node temp=head;
        int i=0;
        while(i<index){
            temp=temp.next;
            i++;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }
        newnode.next=head;
        head=newnode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if(head==null){
            head=tail=newnode;
            size++;
            return;
        }
        tail.next=newnode;
        tail=newnode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>size) return;
        Node temp=head;
        if(index==0){
            addAtHead(val);
            return;
        } 
        if(index==size){
            addAtTail(val);
            return;
        }
        int i=0;
        while(i<index-1){
           temp=temp.next;
           i++;
        }
        Node newnode = new Node(val);
        newnode.next=temp.next;
        temp.next=newnode;
        size++;
        return;

    }
    
    public void deleteAtIndex(int index) {
        if(index<0  || index>=size) return;
        if(head==null) return;
        if(index==0 && size>0){
            head=head.next;
            size--;
            if(size==0) tail=null;
            return;
        }
        Node temp=head;
        int i=0;
        if(index==size-1){
           while(i<index-1){
           temp=temp.next;
           i++;
           }
           temp.next=null;
           tail=temp;
           size--;
           return;

        }
        while(i<index-1){
           temp=temp.next;
           i++;
        }
        temp.next= temp.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */