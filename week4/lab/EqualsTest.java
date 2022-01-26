public class EqualsTest {
    public static class Item {
        int value;

        public Item(int v) {
            value = v;
        }

        public boolean Equals(Item i) {
            return this.value == i.value;
        }

    }

    public static void main(String[] args) {
        Item a = new Item(10);
        Item b = new Item(10);

        System.out.println(a == b);
        // false
        System.out.println(a.Equals(b));
        // true
    }
}