public class LinkedList {

    Node head = null;

    // 01) INSERT NODE AT BEGINNING
    public void insertAtBeginning(int data) {

        Node newNode = new Node(data);

        if (head == null) {

            head = newNode;

            return;

        }

        newNode.next = head;

        head = newNode;

    }

    // 02) INSERT NODE AT LAST
    public void insertAtEnd(int item) {

        Node newNode = new Node(item);

        if (head == null) {

            head = newNode;

            return;

        }

        Node temp = head;

        while (temp.next != null) {

            temp = temp.next;

        }

        temp.next = newNode;

    }

    // 03) INSERT NOTE AT A SPECIFIC POSITION
    public void insertAtSpecificPosition(int data, int position) {

        Node newNode = new Node(data);

        if(position < 0) {

            System.out.println("Invalid Position");

            return;

        }

        if(position == 0) {

            newNode.next = head;

            head = newNode;

            return;

        }

        Node temp = head;

        int index = 0;

        while (temp.next != null) {

            if (index == position - 1) {

                break;

            }

            temp = temp.next;

            index++;

        }

        if (temp.next == null) {

            System.out.println("Position out of bound");

            return;

        }

        newNode.next = temp.next;

        temp.next = newNode;

    }

    // 04) PRINT THE LINED LIST
    public void printData() {

        if (head == null) {

            System.out.println("LinkedList is empty!");

            return;

        }

        Node temp = head;

        while (temp != null) {

            if (temp.next == null) {

                System.out.print(temp.data);

            } else {

                System.out.print(temp.data + " => ");

            }

            temp = temp.next;

        }

        System.out.println();

    }

    // 05) DELETE NODE FROM LAST
    public void deleteLast() {

        if (head == null) {

            System.out.println("linked list is empty");

            return;

        }

        if (head.next == null) {

            head = null;

            return;

        }

        Node temp = head;

        while (temp.next.next != null) {

            temp = temp.next;

        }

        temp.next = null;

    }

    // 06) DELETE NODE FROM FIRST
    public void deleteFirst() {

        if (head == null) {

            System.out.println("Linked List is empty");

            return;

        }

        head = head.next;

    }

    // 07) DELETE NODE FROM SPECIFIC POSITION
    public void deleteNodeFromSpecificPosition(int position) {

        if (head == null) {

            System.out.println("Linked List is empty");

            return;

        }

        if (position == 0) {

            head = head.next;

            return;

        }

        Node temp = head;

        for (int i = 0; i < position - 1 && temp != null; i++) {

            temp = temp.next;

        }

        if (temp == null || temp.next == null) {

            System.out.println("position out of bound");

            return;

        }

        temp.next = temp.next.next;

    }

    // 08) SEARCH FOR THE EXISTENCE OF A NODE
    public boolean searchData(int data) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == data) {

                return true;

            }

            temp = temp.next;

        }

        return false;

    }

}
