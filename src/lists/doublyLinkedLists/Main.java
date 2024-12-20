package lists.doublyLinkedLists;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        list.printList();

        Employee billEnd = new Employee("Bill", "Emd", 78);
        list.addToEnd(billEnd);

        System.out.println(list.getSize());
        list.printList();

        Employee michaelMiddle = new Employee("Michael", "Middle", 456);
        list.addBefore(michaelMiddle, marySmith);

        System.out.println(list.getSize());
        list.printList();
    }
}
