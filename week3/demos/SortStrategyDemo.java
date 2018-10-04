void sortEmployees(List<Employee> employees, IEmployeeComparator comparator) {
    int n = employees.size();
    for (int i = 0; i < n-1; i++)
        for (int j = 0; j < n-i-1; j++){
            if (comparator.compare(employees.get(j), employees.get(j+1))) {
                int temp = employees.get(j);
                employees.set(j, employees.get(j+1));
                employees.set(j+1, temp);
            }
		}
}

interface IEmployeeComparator {
	boolean compareTo(Employee emp1, Employee emp2);
}

class EmployeeLastNameComparator implements IEmployeeComparator {
	boolean compareTo(Employee emp1, Employee emp2){
		return emp1.getLastName() > emp2.getLastName();
	}
}

class EmployeeFirstNameComparator implements IEmployeeComparator {
	boolean compareTo(Employee emp1, Employee emp2){
		return emp1.getFirstName() > emp2.getFirstName();
	}
} 

class EmployeeHiredOnDateComparator implements IEmployeeComparator {
	boolean compareTo(Employee emp1, Employee emp2){
		return emp1.getHiredOnDate() > emp2.getHiredOnDate();
	}
} 