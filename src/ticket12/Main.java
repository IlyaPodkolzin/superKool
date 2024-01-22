package ticket12;

public class Main {

    static class ListNode12 {
        public int data;
        public ListNode12 next;
        public ListNode12() {
        }
        public ListNode12(int data) {
            this.data = data;
        }
        public ListNode12(int data, ListNode12 next) {
            this.data = data;
            this.next = next;
        }
    }


    public class task12 {
        public static void main(String[] args) {
            ListNode12 list = new ListNode12(1, new ListNode12(2));
            list.next.next = new ListNode12(3);
        }
    }

}