public class SLList {

    private static class IntNode {
        int item;
        IntNode next;

        public IntNode(int i, IntNode n){
            this.item = i;
            this.next = n;
        }
    }

    private IntNode sentinel;
    private int size;


    public SLList(){
        sentinel = new IntNode(0, null);
        size = 0;
    }

    public SLList(int x){
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(0, null);
        size = 1;
    }

    public void add(int x){
        sentinel = new IntNode(0, null);
        sentinel.next = new IntNode(x, sentinel.next);
        incrementSize();
    }

    public void addLast(int x){
        IntNode p = sentinel.next;
        while(p.next != null){
            p = p.next;
        }

        p.next = new IntNode(x, null);

        incrementSize();
    }

    private void incrementSize(){
        size++;
    }

    public int size(){
        return size;
    }

    public int retFirst(){
        return sentinel.next.item;
    }

    public static void main(String[] args) {
        SLList intList = new SLList(10);
        System.out.println(intList.retFirst());
        intList.add(20);
        System.out.println(intList.retFirst());
        intList.addLast(20);
        intList.addLast(20);

        System.out.println(intList.size());
    }
}
