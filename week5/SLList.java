public class SLList {
     
    private class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    

    private IntNode first;

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(15);
        L.addFirst(10);
        L.first.next.next = L.first.next;
    }
}


// SLList L = new SLList(15);
// L.addFirst(10);
// L.first.next.next = L.first.next;
// // Error : first는 private

// public : 모든 파일에서 쓸 수 있음
// private : class 내부에서만 쓸 수 있음
// protected : 상속 관련
// package-private : 앞에 아무것도 쓰지 않은 것으로, 파일 디렉토리 내부에서만 접근 가능.