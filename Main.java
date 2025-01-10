import java.util.Scanner;

public class Main {

    public static void printMenu() {

        System.out.println("************MENU************");

        System.out.println("ENTER 1 TO INSERT");
        System.out.println("ENTER 2 TO DELETE");
        System.out.println("ENTER 3 TO SEARCH");
        System.out.println("ENTER 4 TO DISPLAY THE LINKED LIST");
        System.out.println("ENTER 5 TO EXIT");

        System.out.println("************************");

        System.out.println("Enter your choice:");


    }

    public static void insertMenu() {

        System.out.println("PRESS 1 TO INSERT FROM HEAD");
        System.out.println("PRESS 2 TO INSERT FROM TAIL");
        System.out.println("PRESS 3 TO INSERT AT SPECIFIC POSITION");

    }

    public static void deleteMenu() {

        System.out.println("PRESS 1 TO DELETE FROM HEAD");
        System.out.println("PRESS 2 TO DELETE FROM TAIL");
        System.out.println("PRESS 3 TO DELETE AT SPECIFIC POSITION");

    }

    private static void insertDataInsideLinkedList(LinkedList linkedList) {

        insertMenu();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your insert choice:");

        int userChoiceRegardingInsertingItem = sc.nextInt();

        if (userChoiceRegardingInsertingItem == 1) {

            System.out.println("Enter your data:");

            int dataToBeInserted = sc.nextInt();

            linkedList.insertAtBeginning(dataToBeInserted);

            System.out.println("Data inserted successfully");

        } else if (userChoiceRegardingInsertingItem == 2) {

            System.out.println("Enter your data:");

            int dataToBeInserted = sc.nextInt();

            linkedList.insertAtEnd(dataToBeInserted);

            System.out.println("Data inserted successfully");

        } else if (userChoiceRegardingInsertingItem == 3) {

            System.out.println("Enter your data:");

            int dataToBeInserted = sc.nextInt();

            System.out.println("Enter the position where you want to enter the data:");

            int position = sc.nextInt();

            linkedList.insertAtSpecificPosition(dataToBeInserted, position);

            System.out.println("Data inserted successfully");

        } else {

            System.out.println("Invalid choice. Please try again");

        }

    }

    private static void deleteDataFromLinkedList(LinkedList linkedList) {

        deleteMenu();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your delete choice:");

        int userChoiceRegardingDeletingItem = sc.nextInt();

        if (userChoiceRegardingDeletingItem == 1) {

            linkedList.deleteFirst();

            System.out.println("Node deleted successfully.");

        } else if (userChoiceRegardingDeletingItem == 2) {

            linkedList.deleteLast();

            System.out.println("Node deleted successfully.");

        } else if (userChoiceRegardingDeletingItem == 3) {

            System.out.println("Enter the position from where you want to delete the linked list:");

            int position = sc.nextInt();

            linkedList.deleteNodeFromSpecificPosition(position);

            System.out.println("Node deleted successfully.");

        } else {

            System.out.println("Invalid choice. Please try again.");

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList linkedList = new LinkedList();

        System.out.println("************************Welcome to LinkLite CLI************************");

        while (true) {

            try {

                printMenu();

                int userChoice = sc.nextInt();

                if (userChoice == 1) {

                    insertDataInsideLinkedList(linkedList);

                } else if (userChoice == 2) {

                    deleteDataFromLinkedList(linkedList);

                } else if (userChoice == 3){

                    System.out.println("Enter the data you want to search:");

                    int dataToBeSearched = sc.nextInt();

                    boolean res = linkedList.searchData(dataToBeSearched);

                    if (res == true) {

                        System.out.println("The node exists inside the linked list");

                    } else {

                        System.out.println("The node does not exist inside the linked list");

                    }

                } else if (userChoice == 4) {

                    linkedList.printData();

                } else if (userChoice == 5) {

                    System.out.println("Thank your for using the CLI");

                    break;

                }else {

                    System.out.println("Invalid Choice. Please try again");

                }

            } catch (Exception e) {

                System.out.println(e.getMessage());

            }
        }
    }

}
