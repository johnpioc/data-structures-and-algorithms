package lists.doublyLinkedLists;

import java.util.Objects;

public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;
    private EmployeeNode prev;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    public EmployeeNode getPrev() {
        return prev;
    }

    public void setPrev(EmployeeNode prev) {
        this.prev = prev;
    }

    public String toString() {
        return employee.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeNode that = (EmployeeNode) o;
        return Objects.equals(employee, that.employee) && Objects.equals(next, that.next) && Objects.equals(prev, that.prev);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee, next, prev);
    }
}
