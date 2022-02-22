/*
You have Employee interface (that provides: firstName, lastName, department) in your system.
Your company acquired ABC company. In ABC there is system, that is using StaffMember class
(firstName, lastName, unit). Crate adapter that will help you to merge list of employees from
both systems. Show the usage by merging the lists of employees.
*/

package designpatterns.adapter;

public interface Employee {
    String getFirstName();

    String getLastName();

    String getDepartment();
}
