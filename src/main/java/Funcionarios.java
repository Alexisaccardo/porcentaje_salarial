public class Funcionarios {

    public String code;
    public String name;
    public double salary;
    public String age;
    public String direction;
    public String department;
    public String charge;

    public Funcionarios(String code, String name, double salary, String age, String direction, String department, String charge) {
        this.code = code;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.direction = direction;
        this.department = department;
        this.charge = charge;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }
}
