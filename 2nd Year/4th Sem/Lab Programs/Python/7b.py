class Employee:
    tot = 0

    def __init__(self, name, eid, dept, salary):
        self.Name = name
        self.Employee_ID = eid
        self.Department = dept
        self.Salary = salary
        Employee.tot += 1

    def update(self, percent):
        self.Salary += self.Salary * percent / 100

    def display(self):
        print("Name : ", self.Name)
        print("ID : ", self.Employee_ID)
        print("Department : ", self.Department)
        print("Salary : ", self.Salary)


emp = []
n = int(input("Enter number of Employees : "))

for x in range(n):
    name = input("Enter name of employee %d : " % (x + 1))
    eid = int(input("Enter ID of the employee %d : " % (x + 1)))
    dept = input("Enter dept of the employee %d : " % (x + 1))
    salary = int(input("Enter salary of the employee %d : " % (x + 1)))
    emp.append(Employee(name, eid, dept, salary))

eid = int(input("Enter ID of the employee: "))  # Moved outside the loop
dept = input("Enter dept of the employee : ")  # Moved outside the loop
hike = int(input("Percentage of hike in salary : "))  # Moved outside the loop

for x in range(n):
    if eid == emp[x].Employee_ID and dept == emp[x].Department:
        emp[x].update(hike)

print("Employee list with updated salary : ")
for x in range(n):
    emp[x].display()
