package com.workintech.developers;

public class HRManager extends Employee {

    // 3 tane array
    private JuniorDeveloper[] juniors = new JuniorDeveloper[3];
    private MidDeveloper[] mids = new MidDeveloper[3];
    private SeniorDeveloper[] seniors = new SeniorDeveloper[3];

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("HR Manager is hiring people.");
        setSalary(getSalary() + 2000);
    }

    // -----------------------
    // ADD EMPLOYEE (SIMPLE)
    // -----------------------

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniors.length) {
            System.out.println("Index yok!");
            return;
        }

        if (juniors[index] != null) {
            System.out.println("Bu index dolu!");
            return;
        }

        juniors[index] = dev;
        System.out.println("Junior eklendi");
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= mids.length) {
            System.out.println("Index yok!");
            return;
        }

        if (mids[index] != null) {
            System.out.println("Bu index dolu!");
            return;
        }

        mids[index] = dev;
        System.out.println("Mid eklendi");
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniors.length) {
            System.out.println("Index yok!");
            return;
        }

        if (seniors[index] != null) {
            System.out.println("Bu index dolu!");
            return;
        }

        seniors[index] = dev;
        System.out.println("Senior eklendi");
    }
}