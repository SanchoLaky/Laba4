package org.example;
/**
 * The class stores information about a person
 */
public class Person
{
    /**
     * ID of person
     */
    private int ID;
    /**
     * Name of person
     */
    private String name;
    /**
     * Gender of person
     */
    private String gender;
    /**
     * Subdivision of person
     */
    private Subdivision subdivision;
    /**
     * Salary of person
     */
    private float salary;
    /**
     * Birthday of person
     */
    private String birthday;
    public Person(String ID,String name,String gender,String birthday,String title, String salary) {
        subdivision = new Subdivision(title);
        this.ID = Integer.parseInt(ID);
        this.name = name;
        this.gender = gender;
        this.salary = Float.parseFloat(salary);
        this.birthday = birthday;
    }
    /**
     * Method for setting birthday of person
     * @param birthday new date of birth
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    /**
     * Method for setting gender of person
     * @param gender new gender of person
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * Method for setting ID of person
     * @param ID new ID of person
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Method for setting name of person
     * @param name new name of person
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method for setting salary of person
     * @param salary new salary of person
     */
    public void setSalary(float salary) {
        this.salary = salary;
    }
    /**
     * Method for setting subdivision of person
     * @param subdivision new subdivision of person
     */
    public void setSubdivision(Subdivision subdivision) {
        this.subdivision = subdivision;
    }
    /**
     * Method for setting subdivision of person
     * @param subdivision new title of subdivision of person
     */
    public void setSubdivision(String subdivision) {
        this.subdivision.setTitle(subdivision);
    }
    /**
     * Method for getting the salary of person
     * @return salary of person
     */
    public float getSalary() {
        return salary;
    }
    /**
     * Method for getting the ID of person
     * @return ID of person
     */
    public int getID() {
        return ID;
    }
    /**
     * Method for getting the birthday of person
     * @return birthday of person
     */
    public String getBirthday() {
        return birthday;
    }
    /**
     * Method for getting the gender of person
     * @return gender of person
     */
    public String getGender() {
        return gender;
    }
    /**
     * Method for getting the name of person
     * @return name of person
     */
    public String getName() {
        return name;
    }
    /**
     * Method for getting the subdivision of person
     * @return subdivision of person
     */
    public Subdivision getSubdivision() {
        return subdivision;
    }
    /**
     * Method outputs complete information
     * about a person in a special format
     */
    public void printDataPerson() {
        System.out.format("%-10s%-30s%-10s%-10s%-12s%-10s",ID,name,gender,subdivision.printSubdivision(),birthday,salary);
    }
    /**
     * Method outputs complete information
     * about a person without format
     */
    public void printDataPersonWithoutFormat() {
        System.out.print(ID+" ");
        System.out.print(name+" ");
        System.out.print(gender+" ");
        System.out.print(subdivision.printSubdivision()+" ");
        System.out.print(birthday+" ");
        System.out.print(salary+" ");
    }
}
