/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {

    /** Name of the employee. */
    private String name;

    /** Name of the manager for an employee. */
    private String manager;

    /**
     * Constructor for initialization.
     * @param employeeName Name of the employee.
     * @param managerName Name of the manager for an employee.
     */
    public Employee(final String employeeName, final String managerName) {
        this.name = employeeName;
        this.manager = managerName;
    }

    /**
     * Getter for name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     * @param employeeName Name of the employee.
     */
    public void setName(final String employeeName) {
        this.name = employeeName;
    }

    /**
     * Getter for manager.
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     * @param managerName Name of the manager for an employee.
     */
    public void setManager(final String managerName) {
        this.manager = managerName;
    }
}
