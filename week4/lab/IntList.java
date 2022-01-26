public class IntList {
    int first;
    IntList next;

    public int size() {
        if (next == null) {
            return 1;
        }
        return next.size() + 1;
    }

    public int iterativeSize() {
        IntList temp = this;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count ++;
        }
        return count;
    }

    public int get(int index) {
        IntList temp = this;
        int count = index;
        while (count > 0) {
            temp = temp.next;
            count --;
        }
        return temp.first;
    }

    public IntList(int f, IntList n) {
        this.first = f;
        this.next = n;
    }

    public static void main(String[] args) {
        IntList l = new IntList(5, null);
        // l.first = 5;
        // l.next = null;

        // 연쇄 법칙처럼, l.next (pointer) 에 IntList라는 object의 위치가 저장되고 정의됨
        l.next = new IntList(10, null);
        // l.next.first = 10;
        // l.next.next = null;

        l.next.next = new IntList(15, null);
        // l.next.next.first = 15;
        // l.next.next.next = null;

        System.out.println(l.size());
        // result : 3

        System.out.println(l.iterativeSize());
        // result : 3

        System.out.println(l.get(2));
        // result : 15
    }
}
